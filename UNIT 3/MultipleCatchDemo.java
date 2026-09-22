class MultipleCatchDemo
{
    public static void main(String args[])
    {
        try
        {
            int a[] = {10, 20, 30};

            int x = 10 / 0;
            System.out.println(a[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception: Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Exception: Invalid array index");
        }
        catch(Exception e)
        {
            System.out.println("Some other exception occurred");
        }
    }
}