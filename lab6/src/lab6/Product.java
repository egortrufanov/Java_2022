package lab6;

import java.util.Calendar;

public class Product {
    private final int id;
    private String name;
    private final String productCountry;
    private final Calendar productDate;
    private final String serialNumber;
    private double price;

    public Product() {
        id = 0;
        productCountry = null;
        productDate = null;
        serialNumber = null;
    }
    public Product(int id, String name, String productCountry, Calendar productDate, String serialNumber, double price) {
        this.id = id;
        this.name = name;
        this.productCountry = productCountry;
        this.productDate = productDate;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", Название: " + name +
                ", Страна производства: " + productCountry +
                ", Дата производства: " +
                productDate.get(Calendar.DAY_OF_MONTH) + "." +
                productDate.get(Calendar.MONTH) + "." +
                productDate.get(Calendar.YEAR) +
                ", Серийный номер: " + serialNumber +
                ", Цена: " + price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getProductCountry() {
        return productCountry;
    }

    public Calendar getProductDate() {
        return productDate;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


}
