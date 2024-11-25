package Lesson6;

import Lesson6.PlayerWeapons.Weapon;

public class Player {
    private Weapon mainWeapon;
    String name;
    private int currentHitPoint;
    private int money;

    private int intelligence;


    public Player()
    {
        this.name = "Player";
        currentHitPoint = 100;
        money = 100;
    }

    Player(String name, int currentHitPoint, int money, int intelligence, Weapon weapon)
    {
        this.name = name;
        this.currentHitPoint = currentHitPoint;
        this.money = money;
        this.intelligence = intelligence;
        this.mainWeapon = weapon;
    }

    public int getCurrentHitPoint() {
        return currentHitPoint;
    }

    public void setCurrentHitPoint(int currentHitPoint) {
        if (currentHitPoint < 0) {
            this.currentHitPoint = 0;
        }
        else
            this.currentHitPoint = currentHitPoint;
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money > 0)
            this.money = money;
        else
            throw new IllegalArgumentException("Money can't be less 0");
    }

    public Weapon getWeapon()
    {
        return this.mainWeapon;
    }

    public boolean isAlive()
    {
        return currentHitPoint > 0;
    }

    public void attack(Enemy obj)
    {
        if (mainWeapon.getDurability() > 0)
        {
            obj.takeDamage(mainWeapon.getDmg());
        }
    }
}
