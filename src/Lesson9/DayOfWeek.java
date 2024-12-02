package Lesson9;

public enum DayOfWeek {
    SUNDAY ("Воскресенье"),
    MONDAY ("Понедельник"),
    TUESDAY ("Вторник"),
    WEDNESDAY ("Среда"),
    THURSDAY ("Четверг"),
    FRIDAY ("Пятница"),
    SATURDAY ("Суббота");

    private final String name;

    DayOfWeek(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
