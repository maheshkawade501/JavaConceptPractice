package typecasting;

public class DownCasting extends ParentClassExample {
    int a = 200;


    public void actingDrama() {
        System.out.println("Akshay drama");
    }

    @Override
    public void overriddenMethod() {
        System.out.println("Child class overridden");
    }

    public static void main(String[] args) {
        ParentClassExample x = new DownCasting();//upcasting
        DownCasting downCastingexample = (DownCasting) x; //Downcasting

        System.out.println(downCastingexample.a);

        downCastingexample.actingDrama();
        downCastingexample.overriddenMethod();
        downCastingexample.parentMethod();
        //we can not access instance variable of parent by using Downcasting object but we can by upcasting object

        System.out.println(x.a);

    }
}
