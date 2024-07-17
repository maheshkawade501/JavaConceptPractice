package basicjava.languagefundamental.typesofvariable;

public class StaticMethod {

    int x=10;       //instance variable
    static int y=20; //static variable
    public static void staticMethodExample(){      //need to provide the static keyword before the return type

        System.out.println("this is static Method");
        System.out.println(y);
      //  System.out.println(x);//not able to access the x as it is not the static variable
        // ,in static method only staticvariable accessed

    }

    public void nonStaticMethod(){
        System.out.println("this is non static method");
    }

    public static void main(String[] args) {
        //to access the static method no need to create the object
        //but to access any user defined normal method we need to create object to access the method

        staticMethodExample();//no need to give sout
        StaticMethod staticMethod=new StaticMethod();

        staticMethod.nonStaticMethod();//we created object of class to accesss the non static method

    }
}
