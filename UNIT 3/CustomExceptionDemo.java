class MyException extends Exception
{
    MyException(String message)
    {
        super(message);
    }
}

class CustomExceptionDemo
{
    public static void main(String args[])
    {
        int age = 15;

        try
        {
            if(age < 18)
            {
                throw new MyException("Age must be 18 or above");
            }
            else
            {
                System.out.println("You are eligible to vote");
            }
        }
        catch(MyException e)
        {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}