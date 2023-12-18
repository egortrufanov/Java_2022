package lab6;

public class Manager extends Employee {
    public Manager(String name, String surname, double salary) {
        super(name, surname, "менеджер", salary);
    }

    @Override
    public void someFunctional() {
        System.out.println("Некоторая информация про менеджера");
    }
}
