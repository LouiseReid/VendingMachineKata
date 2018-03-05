import java.util.ArrayList;

public class Customer {

    private String name;
    private double purse;
    private ArrayList<Product> products;

    public Customer(String name, double purse) {
        this.name = name;
        this.purse = purse;
        products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getPurse() {
        return purse;
    }

    public ArrayList<Product> getProducts() {
        return new ArrayList<>(this.products);
    }
}
