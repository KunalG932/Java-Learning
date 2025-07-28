public class Car {
    String brand;
    String model;
    int year;
    
    static void p(Object obj) {
        System.out.println(obj);
    }

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        p("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car c = new Car("Toyota", "Supra", 2024);
        c.displayInfo();

    }
}
