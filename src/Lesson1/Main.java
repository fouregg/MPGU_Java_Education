package Lesson1;

public class Main {
    public static void main(String[] args) {
        /*
        * System.out.println - ������� ������ ��������� � �������, ��� �������� ������ println ��������� � �������
        * String[] args - ������ �����, ������� ���������� ��� ������� ����� cmd ���������, ���� ������� ��������� �� ������������ �������
        * public static void main - �������� ������� ������ ������� ���������. ������ �������� ������ ��������� java. main - ��� ������
         */
        //System.out.println(args[0] + " " + args[1]); // ����� ���������� ����� ������. ��������� ���������� ��� ���������� ������� ���������. ���� � "edit configuration" � idea

        castDataType();
    }

    public static void dataType() {
        int x = Integer.MAX_VALUE; // ���������� ���������� � ��������������; int - ������������� ��� ������, ������� ��������� �������� � ��������� �� -2^31 + 1 �� 2^31, ����� ������ 4 �����
        short t; // ���������� ���������� ��� �������������; short - ������������� ��� ������, ������� ��������� �������� � ��������� �� -2^15 + 1 �� 2^15, ����� ������ 2 �����
        byte z = Byte.MAX_VALUE; // byte - ������������� ��� ������, ������� ��������� �������� �� -2^7 + 1 �� 2^7, ����� ������ 1 ����
        long m = Long.MAX_VALUE; // long - ������������� ��� ������, ������� ��������� �������� �� -2^63 + 1 �� 2^63, ����� ������ 8 ����

        float tmp = 25.3f; // float - ��� ������ � ��������� �������("�������"), ������� ��������� �������� �� -3.4 * 10^38 �� 3.4 * 10^38. ���������� ����� � ��������� ���������. � ����� ����� ���� ������� ����� F
        double tmp2 = Double.MAX_VALUE; // double - ��� ������ � ��������� �������("�������"), ������� ��������� �������� �� +- 4.9 * 10^-324 �� +-1.797 * 10^308. ���������� ����� � ������� ���������

        char symbol = 'T'; // char - ���������� ��� ������, ������� ��������� ������ �� ��������� utf-16 � �������� 2 �����

        boolean answer = true; // boolean - ������ ��� ������, ������� ��������� ���� true ���� false

        String string = "Hello, world"; // ��������� ��� ������. ������ - ������ ��������.
        String string2 = new String("Hello, world"); // ���������� � "���������" �����. ��������.

        // + � ���� ������ ������������. ���������� �����.
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

        System.out.println(x + y); // ��������
        System.out.println(x - y); // ���������
        System.out.println(x * y); // ���������
        System.out.println(x / y); // �������
        System.out.println(5 % 3); // ������� �� �������
    }

    public static void compareOperation() {
        int x = 2, y = 10; // �������� ��� ���������� ������ ���� ������. ����� �� ������ ������ ��� ��� ������, ����� ����������� ���������� ����� �������

        System.out.println("x > y:" + (x > y)); // �������������� ���� >
        System.out.println("x < y:" + (x < y)); // �������������� ���� <
        System.out.println("x <= y:" + (x <= y)); // �������������� ���� <=
        System.out.println("x >= y:" + (x >= y)); // �������������� ���� >=
        System.out.println("x == y:" + (x == y)); // �������� ��������� ���� ��������. ������ ��� ���������� ������!(��� � ��� �������)
        System.out.println("x != y:" + (x != y)); // �������� �� ���������. ������ ��� ���������� ������!(��� � ��� �������)
    }

    public static void logicOperation(){
        boolean x = true, y = false;

        System.out.println("x and y" + (x && y)); // && - ������� ��������. ���� ������ ������� ����� false ��������� �� ����� ���� �����������. & - ������ �������� � �������� ���� ���������
        System.out.println("x or y" + (x || y)); // || - ������� ��������. ���� ������ ������� ����� true ��������� �� ����� ���� �����������. | - ������ �������� � �������� ���� ���������
        System.out.println("not x" + (!x)); // ���������� ��
    }

    public static void byteOperation() {
        int x = 8;
        System.out.println(x >> 1); // �������� ��� ���� �� 1 �����. �� ���� ���� 1000 ����� 0100 - 4
        System.out.println(x << 1); // �������� ��� ���� �� 1 ������. �� ���� ���� 1000 ����� 1000 - 16
        System.out.println(x & 10); // ������ ��������� ���������� � ������ 10. 1000 and 1010 = 1000 - 8
        System.out.println(x | 12); // ������ ��������� ���������� � ������ 12. 1000 or 1100 = 1100 - 12
        System.out.println(x ^ 10); // ������ ��������� xor � ������ 10. 1000 xor 1010 - 0010 - 2
        System.out.println(~x); // ������ ��������� �� � ������ 8. ������� ������������� �������������(��� ����� ���������� �� ������������������) �
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
        y = x++; // y = 10, x = 11 ����� ����������. �������� ���������� � ����������� ������ ������(����������� ���������� � ��������� �������)
        System.out.println("x:" + x + ". y: " + y);
        x = 10; y = 0;
        y = ++x; // y = 11 x = 11 �� ����������. �������� ���������� � ���������� ������ ������(����������� ���������� � ������ �������)
        System.out.println("x:" + x + ". y: " + y);
        x--; // ���������. � ���������� ����������� ������ � ����������� � ���������� ������ ������.
    }

    public static void castDataType() {
        double y = 25.3, tmp2 = 0.1;
        int x = 10, tmp = 0;
        boolean answer;
        String str = "210";

        tmp = (int)y; // ����������(cast) y � ���� ������ int.
        tmp2 = (double) x;
        answer = Boolean.valueOf("");
        x = Integer.valueOf(str); // ������ cast ������ � ���� ������ str
        System.out.println(x);
        System.out.println(tmp);
        System.out.println(tmp2);
        System.out.println(answer);
    }
}
