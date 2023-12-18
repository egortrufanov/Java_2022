package lab6;

public class Engineer extends Employee {
    public Engineer(String name, String surname, double salary) {
        super(name, surname, "инженер", salary);
    }

    @Override
    public void someFunctional() {
        System.out.println("Некоторая информация про инженер");
    }
}
