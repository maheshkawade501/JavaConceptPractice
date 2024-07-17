package basicjava.languagefundamental.typesofvariable;

public class LocalVariable {

    public void NormalMethod(){
        int a=100; //local variable valid for the method in which it defined
        System.out.println("Good Morning");
                    }

    public static void main(String[] args) {

        LocalVariable localVariable=new LocalVariable();

       // System.out.println(localVariable.a); //not able to access the variable a
        localVariable.NormalMethod();
    }
}
