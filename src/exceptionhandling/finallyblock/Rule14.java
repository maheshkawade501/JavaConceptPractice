package exceptionhandling.finallyblock;

public class Rule14 {

    //finally block will not executed if program exists
    //(either by calling System.exist() or by causing
    //a fatal error that cause the process to abort


    public static void main(String[] args) {

        try {
            System.exit(0);
            System.out.println(10 / 0);
        } catch (ArithmeticException a) {
            a.printStackTrace();
        }finally {
            System.out.println("this is finally block");
        }

    }
}
