interface Animal {
    void eat();
}

// Interface 2 extends Interface 1
interface Dog extends Animal {
    void bark();
}

// Class implementing the Dog interface
class Puppy implements Dog {

    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void bark() {
        System.out.println("Dog is barking.");
    }
}

// Main class
public class InterfaceExtend {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();
        p.bark();
    }
}