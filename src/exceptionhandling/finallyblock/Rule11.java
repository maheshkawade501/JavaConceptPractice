package exceptionhandling.finallyblock;

public class Rule11 {

    public static void main(String[] args) {
////finally block execute when exception does  occure

        try{
            System.out.println(10/0);
        }finally {
            System.out.println("this is a finally block");
        }

    }
}
