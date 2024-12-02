package Lesson9.SimpleGame;


public class Enemy implements Liveable{
    private final int dmg;
    private int currentHP;

    public int getCurrentHP() {
        return currentHP;
    }

    public Enemy(int dmg) {
        this.currentHP = HP;
        this.dmg = dmg;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    @Override
    public void attack(Object o) {
        if(o instanceof Player hero)
        {
            hero.setCurrentHP(hero.getCurrentHP() - dmg);
        }

        if(o instanceof Enemy hero)
        {
            hero.setCurrentHP(hero.getCurrentHP() - dmg);
        }
    }
}
