package oops.interfacepackage.java8;

public class ImplementedClass1 implements NeedOfDefoultMethod,UseOfDefaultMethod{


    @Override
    public void learn() {
        System.out.println("learning");
    }


    /*if both the interface is having the same method then we have implement that method and using super Keyword we can access seperatly
    that will maintain the multiple inheritance*/
    @Override
    public void study() {
        NeedOfDefoultMethod.super.study();
        UseOfDefaultMethod.super.study();
    }


    public static void main(String[] args) {
        ImplementedClass1 implementedClass1=new ImplementedClass1();
      implementedClass1.study();//interace defoult method can be accessed by object and method from interface when implment
      NeedOfDefoultMethod.staticMethod();
      UseOfDefaultMethod.staticMethod();


    }
}


