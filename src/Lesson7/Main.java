package Lesson7;

public class Main {
    public static void main(String[] args) {
        Main.printNumbers(10, 2, 3);
        //Main.printNumbers(new int[] {10, 2, 3});
    }

    public static void printNumbers(int... numbers)
    {
        for(int num: numbers)
            System.out.println(num);
    }
    /*
    public static void printNumbers(int[] numbers)
    {
        for(int num: numbers)
            System.out.println(num);
    }
    */


}
