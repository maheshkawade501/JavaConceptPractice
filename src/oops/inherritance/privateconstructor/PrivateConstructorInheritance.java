package oops.inherritance.privateconstructor;

public class PrivateConstructorInheritance {

    private PrivateConstructorInheritance(){

        System.out.println("this is private constructor example");
    }

    public static void main(String[] args) {

        PrivateConstructorInheritance privateConstructorInheritance=new PrivateConstructorInheritance();

//Private constructor can be accessed using the object and it can be accessed only in same class but not in other class
        //Not by inhertance as well
    }

}
