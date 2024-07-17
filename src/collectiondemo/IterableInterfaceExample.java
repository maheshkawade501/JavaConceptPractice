package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableInterfaceExample {

    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Mahesh");
        list.add("Advik");
        list.add("Nikhil");
        Iterator iterable=list.iterator();
        while (iterable.hasNext()){
            System.out.println(iterable.next());
        }
    }
}
