package filedemo;

import java.io.File;
import java.io.IOException;

public class FileClassExample {

    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Mahesh\\Class_edso service\\GoodMorning.txt");
        file.createNewFile();
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isFile());
        System.out.println(file.isAbsolute());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.toURI());
        System.out.println(file.isDirectory());

    }
}
