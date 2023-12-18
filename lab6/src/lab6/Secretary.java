package lab6;

public class Secretary extends Employee {
    public Secretary(String name, String surname, double salary) {
        super(name, surname, "секретарь", salary);
    }

    @Override
    public void someFunctional() {
        System.out.println("Некоторая информация про секретаря");
    }
}
