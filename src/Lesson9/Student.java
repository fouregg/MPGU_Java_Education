package Lesson9;

public class Student implements Printable{
    private String FIO;
    private int age;
    private int numCourse;
    private String faculty;

    public Student(String FIO, int age, int numCourse, String faculty) {
        this.FIO = FIO;
        this.age = age;
        this.numCourse = numCourse;
        this.faculty = faculty;
    }

    public Student()
    {
        this.FIO = "Василий Белоусов Андреевич";
        this.age = 20;
        this.numCourse = 2;
        this.faculty = "Информационные технологии";
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumCourse() {
        return numCourse;
    }

    public void setNumCourse(int numCourse) {
        this.numCourse = numCourse;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "FIO='" + FIO + '\'' +
                ", age=" + age +
                ", numCourse=" + numCourse +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
