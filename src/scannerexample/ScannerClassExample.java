package scannerexample;

import java.util.Scanner;

public class ScannerClassExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int no = scanner.nextInt();

        for (int i = 1; i < no; i++) {
            if (i % 2 == 0) {
                System.out.print(" " +i);
            }
        }
    }
}