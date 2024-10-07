package Lessson5;

import java.time.LocalDate;

public class Lesson5 {
    public static void main(String[] args) {
        Person obj = new Person();
        Person person = new Person(25, "Анна", "Корренина", true,
                                   LocalDate.of(1850, 10, 1));
        person.setAge(-10);
        System.out.println(person.getAge());
        System.out.println(person);
        person.setAge(15);
        System.out.println(person.isAdult());
    }
}
