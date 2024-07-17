package basicjava.languagefundamental.typesofvariable;

public class OutsideClassCalling {

    public static void main(String[] args) {
        //using the class name we can access static variable placed in other class

        System.out.println(StaticVariable.a);

        //to call the static method outside of the class we need to give old class name and method name
        StaticMethod.staticMethodExample();
    }
}
