package lab6;

public class Task4 {
    public static void print(Employee[] workers) {
        for (Employee worker : workers){
            worker.someFunctional();
            System.out.println(worker);
        }
    }
    public static void main(String[] args) {
        Employee[] workers = {
                new Director("Игорь", "Захаренко", 100000),
                new Engineer("Василий", "Тихонов", 27000),
                new Secretary("Евгений", "Шпик", 20000),
                new Manager("Марина", "Варнава", 50000),
        };
        print(workers);
    }
}

