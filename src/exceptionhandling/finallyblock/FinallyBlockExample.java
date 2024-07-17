package exceptionhandling.finallyblock;

public class FinallyBlockExample {

   public static void main(String[] args) {

       try{
           System.out.println(10/0);
       }catch (ArithmeticException a){
           a.printStackTrace();
       }finally {
           System.out.println("this is a finally block");
       }


    }
}
