package wrapperclassjava;

public class AutoBoxingExample {

    public static void main(String[] args) {
        int a=100; //premitive data type
        Integer integer=a; //autoboxing--wrapper class

        System.out.println(a);

        float b=integer;//unboxing

        System.out.println(b);
    }
}
