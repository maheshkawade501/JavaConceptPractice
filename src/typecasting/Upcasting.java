package typecasting;

public class Upcasting extends ParentClassExample{

int a=200;


        public void actingDrama(){
            System.out.println("Akshay drama");
        }
    @Override
    public void overriddenMethod() {
        System.out.println("Child class overridden method");
    }

    public static void main(String[] args) {
        ParentClassExample x=new Upcasting();//Upcasting
        System.out.println(x.a);//now we can call parent variable using upcasting
        x.overriddenMethod();//child class overridden method will be called in upcasting although present in parent
        x.parentMethod();
        /* x.actingDrama;//using upcasting we can call parent class variable,overridden child class method,parent class method
        //Can not access the child class variable,method using upcasting*/
    }

}
