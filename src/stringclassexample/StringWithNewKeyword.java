package stringclassexample;

public class StringWithNewKeyword {
    public static void main(String[] args) {

        //with new keyword all the object stored in heap memory
        //object create new string does not check whether previously exist or not as in case of String constant pool in littral
       //Memory allocated fro runnning same object and wil distroy post execution

        String name1 =new String("Mahesh");
        String name2 =new String("Mahesh");

        System.out.println(name1==name2);

    }
}
