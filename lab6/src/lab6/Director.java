package lab6;

public class Director extends Employee {
    public Director(String name, String surname, double salary) {
        super(name, surname, "директор", salary);
    }

    @Override
    public void someFunctional() {
        System.out.println("Некоторая информация про директора");
    }
}
