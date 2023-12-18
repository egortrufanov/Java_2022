package lab2;

class Shirt {
    public void displayShirtInformation(){
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description: " + description);
        System.out.println("Shirt color: " + colorCode);
        System.out.println("Shirt price: " + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }

    private int shirtID = 0;
    private String description = "description";
    private String colorCode = "U";
    private double price = 0.0;
    private int quantityInStock = 0;
}
public class ShirtTest{
    public static void main(String[] args){
        Shirt myShirt;
        myShirt = new Shirt();
        myShirt.displayShirtInformation();
    }
}
