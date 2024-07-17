package scannerexample;

import java.util.Scanner;

public class ScannerClassWithString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Name");
        String name= scanner.nextLine();
        System.out.println(name);

        System.out.println("Please enter the Name1");
        String name1= scanner.next();//only take the string upto the next space
        System.out.println(name1);
    }
}
