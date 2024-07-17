package exceptionhandling;

public class NeedOfExceptionHandling {

    public static void main(String[] args) {
        System.out.println("Hello Good Morning");

        //exception handling
        try{
            //the statemetn thorowing exception should be in try block
            System.out.println(10/0);
        }catch (ArithmeticException a) {               //to catch th exception by object
            a.printStackTrace();                    //Method to print the exception from exception object
        }

        System.out.println("Good Night");

        //programm runs-- good night printed after handling exception
    }
}
