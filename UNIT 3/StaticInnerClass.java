class StaticInnerClass {

    static int num = 10;

    // Static Inner Class
    static class Inner {
        void display() {
            System.out.println("Number is: " + num);
        }
    }

    public static void main(String[] args) {

        // Creating object of Static Inner Class
        StaticInnerClass.Inner obj = new StaticInnerClass.Inner();

        obj.display();
    }
}