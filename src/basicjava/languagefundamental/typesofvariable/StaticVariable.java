package basicjava.languagefundamental.typesofvariable;

public class StaticVariable {

    static  int a=10;

    public static void main(String[] args) {
        System.out.println(a);//no need to create the object to access the static variable

        System.out.println(StaticVariable.a);//with the classname as well we can access the static vairble
    }

}
