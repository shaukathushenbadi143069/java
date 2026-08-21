interface Father {
    void showFather();
}

// Second Interface
interface Mother {
    void showMother();
}

// Child class implements both interfaces
class Child implements Father, Mother {

    public void showFather() {
        System.out.println("This is Father's method.");
    }

    public void showMother() {
        System.out.println("This is Mother's method.");
    }
}

// Main class
public class MultipleInheritance {
    public static void main(String[] args) {
        Child c = new Child();

        c.showFather();
        c.showMother();
    }
}