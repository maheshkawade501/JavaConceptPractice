package basicjava.assignmentpattern;

public class Pattern4 {
    public static void main(String[] args) {

        for (int i = 1; i < 8; i++) {
           for (int j = 8; j > i; j--) {
                System.out.print(" *");
           }

           System.out.println();
        }
    }
}
