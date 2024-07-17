package basicjava.languagefundamental.typesofvariable;

public class TypesVariable {

    int a=10;//instance variable--declared in class and outside of method/block/constructor


    public static void main(String[] args) {

        TypesVariable typesVariable=new TypesVariable();//need  to create object to access the instance variable

       int variable= typesVariable.a;//we can store the instance varioable value in local variable and print it
        System.out.println(variable);

        System.out.println(typesVariable.a);//or we directly use it

        //instance viable can be accessed ouside of the class by cerating object of that class in new class


    }
}

