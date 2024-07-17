package exceptionhandling.finallyblock;

public class Rule10 {

    public static void main(String[] args) {
        //finally block execute when exception does not occure

        try{
            System.out.println(10/10);
        }finally {
            System.out.println("this is finally block");
        }
    }
}
