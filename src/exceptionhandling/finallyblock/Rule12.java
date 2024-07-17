package exceptionhandling.finallyblock;

public class Rule12 {

    public static void main(String[] args) {
        //finally block executs when exception are handled

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException a) {
            a.printStackTrace();
        }finally {
            System.out.println("this is finally block");
        }
    }
}
