package exceptionhandling.finallyblock;

public class Rule9 {

    public static void main(String[] args) {

        //we can define try block without catch block we must need to use finallyblock

        try{
            System.out.println(10/0);
                }finally {
            System.out.println("this is a finally block");
        }



    }
}
