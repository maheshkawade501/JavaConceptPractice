package oops.polymorphism;

public class MethodOverloading {
    //Same method and diffrent parameter
    //Always happen in same class
    public void addition(int a, int b) {
        System.out.println(a + b);
    }

   /* public void addition(int a ,int b){   //not able to achive overloading by usig same method and same parameter
        System.out.println(a + b);
    }*/

     /* public int addition(int a ,int b){   //not able to achive overloading by usig same method and same parameter
      ``````````````````````````````````````````although return type changed
        System.out.println(a + b);
    }
*/


    public void addition(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void addition(int a, int b, int c, int d) {  //we can achive overloading by changing the no. of parameter
        System.out.println(a + b + c + d);
    }

    public void addition(float a, int b) {   //we can achive the overloading by changing the datatype of parameter
        System.out.println(a + b);
    }

    public static void staticMethod(int a) {   //we can overload the sttic method
        System.out.println(a);
    }

    public static void staticMethod(int a, int b) {
        System.out.println(a + b);
    }


    //We can overload the main method as well

    public static void main(String args) {

        System.out.println(args);

    }

    public static void main(String args, int b) {
        System.out.println(args + " " + b);

    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();

        methodOverloading.addition(10, 20);

        methodOverloading.addition(30, 40, 50);

        methodOverloading.addition(25.5f, 50);

        staticMethod(10);
        staticMethod(10, 20);

        main("hello");
        main("GM", 10);
    }


}
