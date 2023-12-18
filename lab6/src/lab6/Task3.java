package lab6;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    interface Scan {
        Person scan() throws Exception;
    }

    public static void main(String[] args) {
        Person person1 = new Person(
                1,
                "Егор",
                "Труфанов",
                new GregorianCalendar(2001, Calendar.OCTOBER, 14),
                "89819103833");
        Person person2 = new Person(
                2,
                "Александр",
                "Симонов",
                new GregorianCalendar(2002, Calendar.MARCH, 1),
                "89213462417");
        Product product1 = new Product(
                1,
                "Juice",
                "Russia",
                new GregorianCalendar(),
                "RU0",
                30.0);
        Product product2 = new Product(
                2,
                "Water",
                "USA",
                new GregorianCalendar(),
                "US0",
                15.0);
        List<Person> personList = List.of(new Person[]{person1, person2});
        List<Product> productList = List.of(new Product[]{product1, product2});

        try {
            Scanner scanner = new Scanner(System.in);
            new Person();
            new Person();
            Person seller, buyer;
            Scan sc = () -> {
                Person person_ = new Person();
                int id;
                if (!scanner.hasNextInt()) throw new Exception("Вы ввели неверный id");
                id = scanner.nextInt();
                for (Person person : personList)
                    if (person.getId() == id) {
                        person_ = person;
                        break;
                    }
                if (person_.getId() == 0)
                    throw new Exception("Вы введи неверный id");
                return person_;
            };
            System.out.print("Введите id покупателя: ");
            seller = sc.scan();
            System.out.print("Введите id продавца: ");
            buyer = sc.scan();
            Order order1 = new Order(0, new GregorianCalendar(), seller, buyer);
            while (true) {
                int amount;
                String productName;
                boolean found = false;
                scanner.nextLine();
                System.out.print("Введите название товара или \"q\" для выхода: ");
                productName = scanner.nextLine();
                if (productName.equals("q")) break;
                for (Product product : productList)
                    if (product.getName().equals(productName)) {
                        found = true;
                        System.out.print("Введите количество товара: ");
                        if (!scanner.hasNextInt()) throw new Exception("Введите другое количество товара");
                        amount = scanner.nextInt();
                        order1.addItem(product, amount);
                        break;
                    }
                if (!found) throw new Exception("Вы ввели неверное название товара");
            }
            System.out.println(order1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }

    }
}

