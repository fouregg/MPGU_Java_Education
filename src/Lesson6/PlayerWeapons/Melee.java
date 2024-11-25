package Lesson6.PlayerWeapons;

import java.util.Random;

public class Melee extends Weapon {
    float criticalChance;
    public Melee()
    {
        super();
        this.criticalChance = 0.02f;
    }

    public Melee(int dmg, int durability, float criticalChance)
    {
        super(dmg, durability);
        this.criticalChance = criticalChance;
    }

    public int criticalAttack()
    {
        Random random = new Random();
        durability -= 4;
        if (random.nextFloat() > 1 - criticalChance) {
            System.out.print("Critical attack! ");
            return this.dmg * 2;
        }
        else
            return this.dmg;
    }
}
