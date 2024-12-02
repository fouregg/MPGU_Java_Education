package Lesson9.SimpleGame;

import Lesson6.PlayerWeapons.Weapon;

public class Player implements Liveable{
    private final Weapon mainWeapon;

    public Player(Weapon mainWeapon) {
        this.mainWeapon = mainWeapon;
        this.currentHP = HP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    private int currentHP;
    @Override
    public void attack(Object o) {
        if (o instanceof Enemy tmp)
        {
            tmp.setCurrentHP(tmp.getCurrentHP() - mainWeapon.getDmg());
        }
    }

}
