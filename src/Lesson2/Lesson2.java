package Lesson2;

import java.util.Scanner;

public class Lesson2 {
    static Scanner sc = new Scanner(System.in); // Scanner - класс сканирования консольного ввода или файлов.
    public static void main(String[] args) {
        loop();
    }

    public static int inputNumber()
    {
        while (true) // бесконечный цикл
        {
            System.out.println("Введите число:");
            if (sc.hasNextInt())  // sc.hasNextInt() - Проверка того, что ввод является int
                return sc.nextInt(); // return прерывает бесконечный цикл sc.nextInt() - взятие int значения из консоли
            System.out.println("Ошибка ввода! Введите целочисленное значение");
            sc.nextLine(); // sc.next() - считывает строку до пробела sc.nextLine() - считывает строку до конца строки
        }
    }

    public static String inputProfession()
    {
        System.out.println("Введите профессию:");
        if (sc.hasNextLine())
            return sc.nextLine();
        else
            return "";
    }

    public static void condition()
    {
        int x;
        x = inputNumber();
        // If - оператор ветвления. Позволяет выполнить действия, которые указанны в теле условия.
        // If (condition) - если condition - true, то условие выполняется, если false не выполняется.
        // Condition - должно быть логическим выражением, результатом которого должно быть true или false и ничего другого
        // Тело условия может не обрамляться фигурными скобками, если оно состоит из 1 действия
        // else - оператор альтернативного ветвления. Выполняется в том случае, если condition в if - false.
        // Тело else может не обрамляться фигурными скобками, если оно состоит из 1 действия.
        // else if(condition) оператор ветвления, который выполняет действия, если предыдущие if и else if не сработали.
        // else if может быть несколько и проверяются они после всех остальных else if
        if(x > 0)
            System.out.println("X > 0");
        else if (x == 0)
            System.out.println("x == 0");
        else
        {
            System.out.println("X < 0");
            System.out.println("wow");
        }

        sc.nextLine(); // Очистка от ввода предыдущего значения
        String inputProfession = inputProfession();
        // switch(variable) - оператор ветвления, который хорошо работает с выборкой условий для единичных значений.
        // Таким образом switch позволяет упростить написание логики для единичных значений.
        // case value: - обработка какого-то конкретного значения, тело пишется с отступом и обязательно в конце break
        // default: - обработка значений, которые не вошли в case(все оставшиеся)
        switch (inputProfession) {
            case "Повар" -> System.out.println("Анекдот про повара");
            case "Адвокат" -> System.out.println("Адвокат!");
            case "Строитель" -> System.out.println("Камень я не дам");
            default -> System.out.println("Я не знаю смешных ситуация по професии: " + inputProfession);
        }
    }

    public static void loop()
    {
        // Цикл for(initial; condition; step) состоит из 3 пунктов(Инициализация переменной цикла, условия до чего идет
        // цикл, шага цикла). (От; до; шаг;)
        for(int i = 0; i < 10; i++)
            System.out.println(i);
        int x;
        for(x = 10; x >= 0; x--)
            System.out.println(x);
        for(int i = 0, j = 10; i < 20 && j > 0; i++, j+=2)
            System.out.println(i + " " + j);
        // while(condition) - цикл пока с предусловием, выполняется пока, условие в скобках true;
        // while(true) - бесконечный цикл
        // while - удобен в использовании, если количество шагов заранее не известно и нужно выполнить неопределенное
        // количество раз действий
        // do{body} while(condition); цикл пока с постусловием. Гарантировано выполнится 1 раз, даже если condition будет
        // false.

        // return variable/value - команда, которая возвращает на место вызова метода или функции значение. Эта команда
        // прерывает действие цикла и дальше метод не работает, как и цикл.
        // break - прерывает, выполнение цикла при вызове. Цикл прерывается на текущей итерации. break; = return;'
        // continue - прерывает выполнение итерации текущего шага цикла и переведет на следующую итерацию.
        for(int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println(i);
        }
        System.out.println("Test");
    }

    public static void chooseMenu()
    {
        int choose;
        do{
            System.out.println("1. add \n2.diff \n3.mult \n4.div\n\n0.exit");
            if(sc.hasNextInt())
                choose = sc.nextInt();
            else {
                choose = 5;
                System.out.println("Wrong punkt, try again");
                sc.nextLine();
            }
        } while (choose != 0);
    }
}
