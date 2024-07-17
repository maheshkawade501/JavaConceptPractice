package oops.interfacepackage.java8;

public interface UseOfDefaultMethod {
    void learn();
    default void study(){
        System.out.println("Interface use of default method");}
    public static void staticMethod(){
            System.out.println("interface use of  use of static Method");
        }
    }


