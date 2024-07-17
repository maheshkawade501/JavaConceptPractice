package basicjava.languagefundamental.constructor;

public class PrivateConstructor {

    int a=10;

    //using private access modifier we cant use the constructor outside of class==singleton pattern
    private PrivateConstructor(){
        System.out.println("This is private constructor");
    }

    public static void main(String[] args) {
        PrivateConstructor privateConstructor=new PrivateConstructor();
        System.out.println(privateConstructor.a);

    }
}
