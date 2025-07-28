public class Dog {
    String name;
    String breed;
    int age;
    static void p(Object obj) {
        System.out.println(obj);
    }
    Dog(String name, String breed, int age) {
        this.name  =name;
        this.breed= breed;
        this.age = age;
    }

    void introduce() {
        p("Woof! My name is "+ name + ", I’m a Great " + breed + " and "+ age +" years old.");
    }

    public static void main(String[] args) {
        Dog d = new Dog("Scooby", "Dane", 5);
        d.introduce();
    }
}

