package filedemo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) throws IOException {
       /* File file=new File("D:\\Mahesh\\Class_edso service\\GoodMorning.txt");
        file.createNewFile();
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write("Hello this is the string we are adding from Java program");*/

        FileReader fileReader=new FileReader("D:\\Mahesh\\Class_edso service\\GoodMorning.txt");

        int i ;
        while((i = fileReader.read())!=-1){
            System.out.print((char) i);
        }fileReader.close();
    }
}
