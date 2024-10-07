package Lessson5;

import java.util.Date;
import java.time.LocalDate;

public class Person {
    // Все характеристики, которые описывают класс, называются свойствами класса
    private int age;
    private String firstName;
    private String lastName;
    private boolean gender;
    private LocalDate birthday;

    // Геттеры - методы для получения данных из свойств класса
    public int getAge() {
        return age;
    }
    // Сеттеры - методы для установки данных из свойств класса
    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else
            System.err.println("Ошибка! Возвраст не может являться отрицательным значением");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 1)
            this.firstName = firstName;
        else
            System.out.println("Ошибка! Имя должно содержать не менее 2 букв");

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length() > 1)
            this.lastName = lastName;
        else
            System.out.println("Ошибка! Фамилия должно содержать не менее 2 букв");
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    // Конструктор по умолчанию. Это автоматически вызываемый метод, который вызывается при инициализации объекта
    // Конструктор по умолчанию - это не параметризованный конструктор, определяет данные для "дефолтового" объекта
    // Конструктор обязан иметь имя, эквивалентное имени класса
    public Person() {
        this.age = 20; // this - это указатель на объект, который создает этот класс.
        this.firstName = "Вася";
        this.lastName = "Тереньев";
        this.gender = false;
        birthday = LocalDate.of(2000, 10, 10);
    }

    // Параметризованный конструктор - это конструктор с параметрами, задает данные переданные при создании объекта
    public Person(int age, String firstName, String lastName, boolean gender, LocalDate birthday) {
        this.age = age; // this в этом случае помогает решить проблему неоднозначности
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = birthday;
    }

    @Override // Аннотация, которая говорит, что мы переопределяем метод, объявленный ранее
    public String toString() { // Метод, который возвращает строчное представление объекта
        // Метод срабатывает автоматически при обращении к объекту в sout
        return ("Имя: " + this.firstName + "\nФамилия: " + this.lastName +
                "\nВозраст: " + this.age + "\nПол: " + (this.gender? "Женский": "Мужской") +
                "\nДата рождения: " + this.birthday);
    }

    // Создали действия для всех объектов, это проверка на "взрослость" такие действия называются методами
    public boolean isAdult(){
        return age >= 18 ? true: false;
    }
}
