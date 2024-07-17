package oops.abstraction;

public class TestImplementation extends AbstractClass{
    //everything from abstract class has to be implemented then only compiple time error removes

    TestImplementation(int a){
        super(a);               //if abstract class having he constructor then wih the help of super keyword
        // we can access the instane variable in child class and defin its valu
    }
    @Override
    public void abstractMethod() {
        System.out.println("this is a implemented method");
    }

    public static void main(String[] args) {
        TestImplementation testImplementation=new TestImplementation(10);
        testImplementation.abstractMethod();
        testImplementation.finalMethod();
        testImplementation.normalMethod();
        AbstractClass.staticMethod();
        System.out.println(testImplementation.a);
    }




}
