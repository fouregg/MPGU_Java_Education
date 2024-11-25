package Lesson6;

import Lesson6.PlayerWeapons.Magic;
import Lesson6.PlayerWeapons.Melee;
import Lesson6.PlayerWeapons.Weapon;

import java.util.Random;
import java.util.Scanner;

public class Lesson6 {
    static Player player;
    public static void main(String[] args) {
        int numMenu = menuOut("1. Play \n0. Exit");
        switch (numMenu)
        {
            case 1:
            {
                Weapon weapon = null;

                Random random = new Random();
                int typeWeapon = menuOut("1. Melee weapon\n2. Magic weapon");

                switch (typeWeapon)
                {
                    case 1: {
                        weapon = new Melee(random.nextInt(20), 50 + random.nextInt(50),
                                random.nextFloat(0.4f));
                        break;
                    }
                    case 2: {
                        weapon = new Magic(random.nextInt(15), 35 + random.nextInt(50),
                                 random.nextFloat(0.7f));
                        break;
                    }
                }
                player = new Player("Alex",120, 100, 10, weapon);

                Enemy[] massEnemy = createMassEnemy(10);
                int points = 0;
                int sumDmgPlayer = 0;
                int killEnemy = 0;

                for (int i = 0; i < massEnemy.length; i++)
                {
                    while (massEnemy[i].isAlive())
                    {
                        int dmg;
                        // instanceof - позволяет определить тип данных переменной
                        if(player.getWeapon() instanceof Melee)
                        {
                            dmg = ((Melee) player.getWeapon()).criticalAttack();
                            System.out.println("Player " + player.name + " attack enemy with dmg: " + dmg);
                            sumDmgPlayer += ((Melee) player.getWeapon()).criticalAttack();
                            massEnemy[i].takeDamage(dmg);
                        }

                        dmg = player.getWeapon().getDmg();
                        sumDmgPlayer += dmg;
                        massEnemy[i].takeDamage(dmg);

                        System.out.println("Enemy with hp " + massEnemy[i].getCurrentHitPoint() +
                                " attack player with dmg: " + massEnemy[i].getDmg());
                        massEnemy[i].giveDamage(player);
                    }

                    player.setMoney(player.getMoney() + 10);
                    killEnemy++;
                    points += 25;
                }
            }
        }
    }

    public static int menuOut(String output)
    {
        int numMenu;
        while (true) {
            try {
                System.out.println(output);
                numMenu = menuInput();
                break;
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        return numMenu;
    }

    public static int menuInput() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        if (sc.hasNextInt())
            return sc.nextInt();
        else
            throw new Exception("Wrong input try again");
    }

    public static Enemy[] createMassEnemy(int capacity)
    {
        Enemy[] massEnemy = new Enemy[capacity];
        Random random = new Random();
        for(int i = 0; i < massEnemy.length; i++)
            massEnemy[i] = new Enemy(random.nextInt(50), random.nextInt(10));
        return massEnemy;
    }
}

