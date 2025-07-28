public class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound(); // What will this print?
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}