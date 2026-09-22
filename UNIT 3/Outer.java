
class Outer
{
    int number = 100;

    // Inner class
    class Inner
    {
        void display()
        {
            System.out.println("This is a simple inner class.");
            System.out.println("Number = " + number);
        }
    }

    public static void main(String[] args)
    {
        // Create object of Outer class
        Outer outer = new Outer();

        // Create object of Inner class
        Outer.Inner inner = outer.new Inner();

        // Call inner class method
        inner.display();
    }
}
