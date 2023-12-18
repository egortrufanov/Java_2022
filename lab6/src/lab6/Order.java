package lab6;

import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public class Order {
    private final int id;
    private final Calendar date;
    private final Person seller;
    private final Person buyer;
    private HashMap<Product, Integer> basket;
    private double cost;

    public Order(int id, Calendar date, Person seller, Person buyer) {
        this.id = id;
        this.date = date;
        this.seller = seller;
        this.buyer = buyer;
        this.basket = new HashMap();
    }

    @Override
    public String toString() {
        AtomicReference<String> products = new AtomicReference<>("");
        basket.forEach((key, value) -> {
            products.set(products + "товар: " + key + ", количество: " + value + ",\n");
        });
        return "Заказ:" +
                "\nid: " + id +
                "\nДата заказа: " +
                date.get(Calendar.DAY_OF_MONTH) + "." +
                date.get(Calendar.MONTH) + "." +
                date.get(Calendar.YEAR) +
                "\nПродавец: " + seller +
                "\nПокупатель: " + buyer +
                "\nКорзина: " +products +
                "\nСтоимость: " + cost;
    }

    public void addItem(Product product, Integer amount) {
        this.basket.put(product, amount);
        this.cost += product.getPrice() * amount;
    }

    public int getId() {
        return id;
    }
    public Calendar getDate() {
        return date;
    }
    public Person getSeller() {
        return seller;
    }
    public Person getBuyer() {
        return buyer;
    }
    public HashMap<Product, Integer> getBasket() {
        return basket;
    }
    public double getCost() {
        return cost;
    }
}
