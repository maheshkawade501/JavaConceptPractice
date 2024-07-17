package basicjava.languagefundamental.typesofvariable;

public class StaticBlock {

    static {
        System.out.println("this is a static block");
    }


    public static void main(String[] args) {  //Main method is must for execution of java program

        System.out.println("this is a main method");

        //first static method run and then main method as satic method execute on load of class only

    }
}
