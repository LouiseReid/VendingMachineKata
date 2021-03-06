import java.util.ArrayList;

public class Tray {

    private double price;
    private int capacity;
    private ArrayList<Product> stock;

    public Tray(double price, int capacity) {
        this.price = price;
        this.capacity = capacity;
        this.stock = new ArrayList<>();
    }

    public double getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Product> getStock() {
        return new ArrayList<>(this.stock);
    }

    public int stockLevel(){
        return this.stock.size();
    }

    public void addItem(Product product) {
        if(stockLevel() < capacity){
            stock.add(product);
        }
    }

    public Product removeProduct(){
        return stock.remove(0);
    }
}
