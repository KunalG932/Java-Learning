public class Vehicle {
    int speed;
    
    Vehicle(int speed) {
        this.speed = speed;
    }


    void accelerate() {
        speed += 10;
        System.out.println("Accelerating... Current speed: " + speed);
    }

    void brake() {
        speed -= 5;
        System.out.println("Braking... Current speed: " + speed);
    }

    void displaySpeed() {
        System.out.println("Current speed is: " + speed);
    }

    public static void main(String[] args) {
        Vehicle vroom = new Vehicle(50);

        vroom.accelerate();    // +10 → 60
        vroom.brake();         // -5  → 55
        vroom.brake();         // -5  → 50
        vroom.displaySpeed();  // Final speed
    }
}
