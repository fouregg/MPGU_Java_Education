package Lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        testArrayList();
    }

    public static void testArrayList()
    {
        List<String> people = new ArrayList<String>();
        // Add in list
        people.add("Alex");
        people.add("Max");
        people.add("Testor");
        // Add in list with index
        people.add(1, "Nost");
        for(String name: people)
            System.out.print(name + " ");
        System.out.println();
        people.sort(((o1, o2) -> o1.length() > o2.length()? 1: -1));
        for(String name: people)
            System.out.print(name + " ");
        System.out.println();
        // Remove Max
        people.remove("Max");
        // Remove on index
        people.remove(0);
        // get all element with loop
        for(int i = 0; i < people.size(); i++)
            System.out.println(people.get(i));
        // check contains
        System.out.println(people.contains("Test"));

        List <Integer> numbers = new ArrayList<Integer>(Arrays.asList(7, 4, 5, 10, 3));

        for (Integer element: numbers) {
            System.out.print(element + " ");
        }
        System.out.println();
        numbers.sort((o1, o2) -> Integer.compare(o1, o2));

        for (Integer element: numbers) {
            System.out.print(element + " ");
        }
        System.out.println();
        List<Integer> newList = numbers.subList(1, numbers.size() - 1);
        for(Integer element: newList)
            System.err.print(element + " ");

        List<Person> users = new LinkedList<Person>();
    }
}
