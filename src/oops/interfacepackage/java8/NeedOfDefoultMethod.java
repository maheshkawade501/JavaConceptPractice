package oops.interfacepackage.java8;

import basicjava.assignmentarrays.SumOfElement;

public interface NeedOfDefoultMethod {
    void learn();
    default void study(){
        System.out.println("Interface default method");
    }

    private void privateMethod(){
        System.out.println("Private method of Interface");
    }
    public static void staticMethod(){
        System.out.println("interface static Method");
    }
//only cant create object
    public static void main(String[] args) {
        System.out.println("hi");
        staticMethod();
    }
}
