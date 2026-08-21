abstract class Animal {

    // Abstract method
    abstract void sound();

    // Normal method
    void display() {
        System.out.println("This is an Animal.");
    }
}

// Child class overrides the abstract method
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class AbstractOverride {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.display();
        d.sound();
    }
}