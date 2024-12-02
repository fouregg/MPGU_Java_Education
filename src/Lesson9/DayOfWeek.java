package Lesson9;

public enum DayOfWeek {
    SUNDAY ("�����������"),
    MONDAY ("�����������"),
    TUESDAY ("�������"),
    WEDNESDAY ("�����"),
    THURSDAY ("�������"),
    FRIDAY ("�������"),
    SATURDAY ("�������");

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
