package exceptionhandling;

import java.io.FileReader;

public class CheckedException {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("D:\\Mahesh\\Class_edso service\\Assignmenton Arrays\\Sorting");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
