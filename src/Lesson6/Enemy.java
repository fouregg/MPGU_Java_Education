package Lesson6;

public class Enemy {
    private int currentHitPoint;
    private int dmg;

    public Enemy()
    {
        currentHitPoint = 100;
        dmg = 10;
    }

    public Enemy(int currentHitPoint, int dmg)
    {
        this.currentHitPoint = currentHitPoint;
        this.dmg = dmg;
    }

    public int getCurrentHitPoint() {
        return currentHitPoint;
    }

    public int getDmg() {
        return dmg;
    }

    public boolean takeDamage(int dmg)
    {
        if (currentHitPoint - dmg > 0)
        {
            currentHitPoint -= dmg;
            return false;
        }
        else
        {
            currentHitPoint = 0;
            return true;
        }
    }

    public void giveDamage(Player obj)
    {
        if (obj.isAlive())
        {
            obj.setCurrentHitPoint(obj.getCurrentHitPoint() - dmg);
        }
        else
            System.out.println("Player dead, enemy Win!");
    }

    public boolean isAlive()
    {
        return currentHitPoint > 0;
    }
}
