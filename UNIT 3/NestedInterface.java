class NestedInterface {

    // Nested Interface
    interface Message {
        void display();
    }

    // Implementing the nested interface
    static class Demo implements Message {
        public void display() {
            System.out.println("This is a Nested Interface.");
        }
    }

    public static void main(String[] args) {

        // Creating object of implementing class
        Demo obj = new Demo();

        // Calling method
        obj.display();
    }
}