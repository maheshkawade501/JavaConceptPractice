package basicjava.languagefundamental.thiskeyword;

public class ThisConstructor {

    ThisConstructor(int a) {
        this(10, 20);  //this keyword need to provide at first line only in constructor
        System.out.println(a);
    }

    ThisConstructor(int a, int b) {
        this(10, 20, 30);
        System.out.println(a + " " + b);
    }

    ThisConstructor(int a, int b, int c) {
        System.out.println(a + " " + b + " " + c);
    }


    public static void main(String[] args) {
        ThisConstructor thisConstructor = new ThisConstructor(10);
        //as parameterised constructor used we need to give value to parameter


    }
}
