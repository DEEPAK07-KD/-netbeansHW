package shopping;
public class Product {
    int id;
    String name;
    double price;
    Product next;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.next=null;
    }
    
}
