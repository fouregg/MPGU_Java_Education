package Lesson2;

import java.util.Scanner;

public class Lesson2 {
    static Scanner sc = new Scanner(System.in); // Scanner - ����� ������������ ����������� ����� ��� ������.
    public static void main(String[] args) {
        loop();
    }

    public static int inputNumber()
    {
        while (true) // ����������� ����
        {
            System.out.println("������� �����:");
            if (sc.hasNextInt())  // sc.hasNextInt() - �������� ����, ��� ���� �������� int
                return sc.nextInt(); // return ��������� ����������� ���� sc.nextInt() - ������ int �������� �� �������
            System.out.println("������ �����! ������� ������������� ��������");
            sc.nextLine(); // sc.next() - ��������� ������ �� ������� sc.nextLine() - ��������� ������ �� ����� ������
        }
    }

    public static String inputProfession()
    {
        System.out.println("������� ���������:");
        if (sc.hasNextLine())
            return sc.nextLine();
        else
            return "";
    }

    public static void condition()
    {
        int x;
        x = inputNumber();
        // If - �������� ���������. ��������� ��������� ��������, ������� �������� � ���� �������.
        // If (condition) - ���� condition - true, �� ������� �����������, ���� false �� �����������.
        // Condition - ������ ���� ���������� ����������, ����������� �������� ������ ���� true ��� false � ������ �������
        // ���� ������� ����� �� ����������� ��������� ��������, ���� ��� ������� �� 1 ��������
        // else - �������� ��������������� ���������. ����������� � ��� ������, ���� condition � if - false.
        // ���� else ����� �� ����������� ��������� ��������, ���� ��� ������� �� 1 ��������.
        // else if(condition) �������� ���������, ������� ��������� ��������, ���� ���������� if � else if �� ���������.
        // else if ����� ���� ��������� � ����������� ��� ����� ���� ��������� else if
        if(x > 0)
            System.out.println("X > 0");
        else if (x == 0)
            System.out.println("x == 0");
        else
        {
            System.out.println("X < 0");
            System.out.println("wow");
        }

        sc.nextLine(); // ������� �� ����� ����������� ��������
        String inputProfession = inputProfession();
        // switch(variable) - �������� ���������, ������� ������ �������� � �������� ������� ��� ��������� ��������.
        // ����� ������� switch ��������� ��������� ��������� ������ ��� ��������� ��������.
        // case value: - ��������� ������-�� ����������� ��������, ���� ������� � �������� � ����������� � ����� break
        // default: - ��������� ��������, ������� �� ����� � case(��� ����������)
        switch (inputProfession) {
            case "�����" -> System.out.println("������� ��� ������");
            case "�������" -> System.out.println("�������!");
            case "���������" -> System.out.println("������ � �� ���");
            default -> System.out.println("� �� ���� ������� �������� �� ��������: " + inputProfession);
        }
    }

    public static void loop()
    {
        // ���� for(initial; condition; step) ������� �� 3 �������(������������� ���������� �����, ������� �� ���� ����
        // ����, ���� �����). (��; ��; ���;)
        for(int i = 0; i < 10; i++)
            System.out.println(i);
        int x;
        for(x = 10; x >= 0; x--)
            System.out.println(x);
        for(int i = 0, j = 10; i < 20 && j > 0; i++, j+=2)
            System.out.println(i + " " + j);
        // while(condition) - ���� ���� � ������������, ����������� ����, ������� � ������� true;
        // while(true) - ����������� ����
        // while - ������ � �������������, ���� ���������� ����� ������� �� �������� � ����� ��������� ��������������
        // ���������� ��� ��������
        // do{body} while(condition); ���� ���� � ������������. ������������� ���������� 1 ���, ���� ���� condition �����
        // false.

        // return variable/value - �������, ������� ���������� �� ����� ������ ������ ��� ������� ��������. ��� �������
        // ��������� �������� ����� � ������ ����� �� ��������, ��� � ����.
        // break - ���������, ���������� ����� ��� ������. ���� ����������� �� ������� ��������. break; = return;'
        // continue - ��������� ���������� �������� �������� ���� ����� � ��������� �� ��������� ��������.
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
