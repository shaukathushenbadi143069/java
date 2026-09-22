class ExceptionPropagationDemo
{
    static void method1()
    {
        int a = 10;
        int b = 0;

        int result = a / b;
        System.out.println("Result = " + result);
    }

    static void method2()
    {
        method1();
    }

    static void method3()
    {
        method2();
    }

    public static void main(String args[])
    {
        try
        {
            method3();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught: Cannot divide by zero");
        }

        System.out.println("Program continues...");
    }
}