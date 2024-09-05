package Lesson1;

public class Main {
    public static void main(String[] args) {
        /*
        * System.out.println - команда вывода сообщений в консоль, где аргумент метода println выводится в консоль
        * String[] args - массив строк, которые передаются при запуске через cmd программы, либо берутся аргументы из конфигурации запуска
        * public static void main - является входной точкой запуска программы. Отсюда начинает работу программа java. main - имя метода
         */
        //System.out.println(args[0] + " " + args[1]); // Вывод аргументов через пробел. Аргументы передаются при консольном запуске программы. Либо в "edit configuration" в idea

        castDataType();
    }

    public static void dataType() {
        int x = Integer.MAX_VALUE; // Объявление переменной с инициализацией; int - целочисленный тип данных, который принимает значения в диапазоне от -2^31 + 1 до 2^31, объем памяти 4 байта
        short t; // Объявление переменной без инициализации; short - целочисленный тип данных, который принимает значение в диапазоне от -2^15 + 1 до 2^15, объем памяти 2 байта
        byte z = Byte.MAX_VALUE; // byte - целочисленный тип данных, который принимает значений от -2^7 + 1 до 2^7, объем памяти 1 байт
        long m = Long.MAX_VALUE; // long - целочисленный тип данных, который принимает значения от -2^63 + 1 до 2^63, объем памяти 8 байт

        float tmp = 25.3f; // float - тип данных с плавающей запятой("дробный"), который принимает значения от -3.4 * 10^38 до 3.4 * 10^38. Аналогично число с одинарной точностью. В конце числа надо ставить букву F
        double tmp2 = Double.MAX_VALUE; // double - тип данных с плавающей запятой("дробный"), который принимает значение от +- 4.9 * 10^-324 до +-1.797 * 10^308. Аналогично числу с двойной точностью

        char symbol = 'T'; // char - символьный тип данных, который принимает символ из кодировки utf-16 и занимает 2 байта

        boolean answer = true; // boolean - булевы тип данных, который принимает либо true либо false

        String string = "Hello, world"; // Строковой тип данных. Строка - массив символов.
        String string2 = new String("Hello, world"); // Объявление в "классовом" стиле. Устарело.

        // + в этом случае конкатенация. Склеивание строк.
        System.out.println("Max integer value: " + x);
        System.out.println("Max byte value: " + z);
        System.out.println("Max long value: " + m);
        System.out.println("Example float: " + tmp);
        System.out.println("Max double value: " + tmp2);
        System.out.println("Example symbol: " + symbol);
        System.out.println("Example boolean: " + answer);
        System.out.println("Example string: " + string);
        System.out.println("Another example: " + string2);
    }

    public static void arithmeticOperation() {
        int x = 2;
        float y = 2;

        System.out.println(x + y); // Сложение
        System.out.println(x - y); // Вычитание
        System.out.println(x * y); // Умножение
        System.out.println(x / y); // Деление
        System.out.println(5 % 3); // Остаток от деления
    }

    public static void compareOperation() {
        int x = 2, y = 10; // Объявили две переменные одного типа данных. Чтобы не писать каждый раз тип данных, можно перечислить переменные через зяпятую

        System.out.println("x > y:" + (x > y)); // Математический знак >
        System.out.println("x < y:" + (x < y)); // Математический знак <
        System.out.println("x <= y:" + (x <= y)); // Математический знак <=
        System.out.println("x >= y:" + (x >= y)); // Математический знак >=
        System.out.println("x == y:" + (x == y)); // Проверка равенства двух значений. Строки так сравнивать нельзя!(как и все объекты)
        System.out.println("x != y:" + (x != y)); // Проверка не равенства. Строки так сравнивать нельзя!(как и все объекты)
    }

    public static void logicOperation(){
        boolean x = true, y = false;

        System.out.println("x and y" + (x && y)); // && - быстрая проверка. Если первый операнд будет false остальные не будут даже запускаться. & - полная проверка с запуском всех операндов
        System.out.println("x or y" + (x || y)); // || - быстрая проверка. Если первый операнд будет true остальные не будут даже запускаться. | - полная проверка с запуском всех операндов
        System.out.println("not x" + (!x)); // Логическое НЕ
    }

    public static void byteOperation() {
        int x = 8;
        System.out.println(x >> 1); // Сдвигает все биты на 1 влево. То есть было 1000 стало 0100 - 4
        System.out.println(x << 1); // Сдвигает все биты на 1 вправо. То есть было 1000 стало 1000 - 16
        System.out.println(x & 10); // Делает побитовую конъюнкцию с числом 10. 1000 and 1010 = 1000 - 8
        System.out.println(x | 12); // Делает побитовую дизъюнкцию с числом 12. 1000 or 1100 = 1100 - 12
        System.out.println(x ^ 10); // Делает побитовое xor с числом 10. 1000 xor 1010 - 0010 - 2
        System.out.println(~x); // Делает побитовое не с числом 8. Сделает положительное отрицательным(бит знака поменяется на протоивоположенный) и
    }

    public static void combinationOperator(){
        int x = 10;
        System.out.println("x += 10: " + (x += 10)); // x = x + 10
        System.out.println("x -= 10: " + (x -= 10)); // x = x - 10
        System.out.println("x *= 10: " + (x *= 10)); // x = x * 10
        System.out.println("x /= 10: " + (x /= 10)); // x = x / 10
        System.out.println("x %= 10: " + (x %= 10)); // x = x % 10
    }

    public static void incrementOperation(){
        int x = 10, y = 0;
        y = x++; // y = 10, x = 11 после присвоения. Операция инкремента с постфиксной формой записи(выполняется приращение в последнюю очередь)
        System.out.println("x:" + x + ". y: " + y);
        x = 10; y = 0;
        y = ++x; // y = 11 x = 11 до присвоения. Операция инкремента с префиксной формой записи(выполняется приращение в первую очередь)
        System.out.println("x:" + x + ". y: " + y);
        x--; // Декремент. У декремента аналогичная работа с постфиксной и префиксной формой записи.
    }

    public static void castDataType() {
        double y = 25.3, tmp2 = 0.1;
        int x = 10, tmp = 0;
        boolean answer;
        String str = "210";

        tmp = (int)y; // Приведение(cast) y к типу данных int.
        tmp2 = (double) x;
        answer = Boolean.valueOf("");
        x = Integer.valueOf(str); // Нельзя cast строки к типу данных str
        System.out.println(x);
        System.out.println(tmp);
        System.out.println(tmp2);
        System.out.println(answer);
    }
}
