class LocalInnerClass {

    void display() {

        // Local Inner Class
        class Inner {
            void show() {
                System.out.println("This is a Local Inner Class.");
            }
        }

        // Creating object of Local Inner Class
        Inner obj = new Inner();
        obj.show();
    }

    public static void main(String[] args) {

        LocalInnerClass outer = new LocalInnerClass();
        outer.display();
    }
}