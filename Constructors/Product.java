public class Product {
    String name;
    double price;
    int quantity;

    void p(Object obj){
        System.out.println(obj);
    }
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    void displayInfo() {
        p("Product: " + name);
        p("Price: " + price);
        p("Quantity: " + quantity);
    }
    public static void main(String[] args) {
        Product p = new Product("Mouse", 122.3, 10);
        p.displayInfo();

        Product p2 = new Product("Keyboard", 99.99);
        p2.displayInfo();
    }
}