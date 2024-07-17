package exceptionhandling;

public class UnCheckedException {

    public static void main(String[] args) {
        String name = null;
        try {
            System.out.println(name.length());
        } catch (NullPointerException n) {
            n.printStackTrace();
        }

        System.out.println("Hi");
    }
}
