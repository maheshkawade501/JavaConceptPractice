package filedemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Mahesh\\Class_edso service\\GoodMorning.txt");
        file.createNewFile();
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write("Hello this is the string we are adding from Java program");
        fileWriter.close();

    }
}
