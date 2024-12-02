package Lesson9;

import Lesson6.PlayerWeapons.Magic;
import Lesson9.SimpleGame.Enemy;
import Lesson9.SimpleGame.Liveable;
import Lesson9.SimpleGame.Player;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        // Прокидывание ошибки. То есть метод приостанавливает свою работу и выводит исключение. Программа заканчивает свю работу
        try {
            throw new ArithmeticException("Test exception");
        }
        catch (ArithmeticException e)
        {
            System.err.println("Арифметическая ошибка");
        }
        catch (Exception e)
        {
            System.err.println("Отловил какое-то исключение");
        }

    }

    public static void playGame()
    {
        int score = 0;
        Random random = new Random();
        Liveable player = new Player(new Magic());
        Enemy tmp = null;
        int countDay = 0;
        while (player.isAlive())
        {
            /*
            switch (countDay % 7)
            {
                case 0 -> System.out.println("Счастливый " + DayOfWeek.SUNDAY);
                case 1 -> System.out.println("Ужасный " + DayOfWeek.MONDAY);
                case 2 -> System.out.println("Невыносимый " + DayOfWeek.TUESDAY);
                case 3 -> System.out.println("Терпимый " + DayOfWeek.WEDNESDAY);
                case 4 -> System.out.println("Хороший " + DayOfWeek.THURSDAY);
                case 5 -> System.out.println("Слава Богу это " + DayOfWeek.FRIDAY);
                case 6 -> System.out.println("Замечательная " + DayOfWeek.SATURDAY);
            }
             */
            System.out.println("Сегодня: " + DayOfWeek.values()[countDay % 7] + " " + ((Enemy)player).getCurrentHP());
            if (tmp == null || !tmp.isAlive())
                tmp = new Enemy(random.nextInt(10));
            player.attack(tmp);
            if (tmp.isAlive())
                tmp.attack(player);
            else
                score += 100;
            countDay++;
        }
        System.out.println("Player, dead, he earn: " + score + " points. Player alive: " + countDay);
    }
}
