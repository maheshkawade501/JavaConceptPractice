package oops.abstraction;

public  abstract class AbstractClass {

    //in abstract class we can define variable,constructor,abstract method,
    // concrete method,static method,final methode ,private method,main method
    //we can not create the object of abstract class
  int a;

    AbstractClass(int a){
this.a=a;
    }
public  abstract void abstractMethod(); //Abstract Method

    public void normalMethod(){                //Concrete Method
        System.out.println("this is normal Method");
    }

    public static void staticMethod(){
        System.out.println("this is static Method");
    }

    public final void finalMethod(){
        System.out.println("final Method");
    }

    public static void main(String[] args) {

    }

    private  void privateMethod(){
        System.out.println("private Method");
    }
}
