package lab6;

public abstract class Employee {
    protected String name;
    protected String surname;
    protected String position;
    protected double salary;

    public Employee(String name, String surname, String position, double salary) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    protected abstract void someFunctional();

    @Override
    public String toString() {
        return "Работник: " +
                "Имя: " + name +
                ", Фамилия: " + surname +
                ", Должность: " + position +
                ", Зарплата: " + salary;
    }
}
