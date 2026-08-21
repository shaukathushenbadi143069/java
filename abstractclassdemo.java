// Abstract class
abstract class Animal {
    // Abstract method
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Child class
class Dog extends Animal {

    // Implementing abstract method
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Main class
public class abstractclassdemo {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();      // Calling normal method
        d.sound();    // Calling implemented abstract method
    }
}
