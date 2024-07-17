package oops.inherritance;

public class ProtectedAccessModifier {

  protected   int a=100;

    protected void protectedAccessMethod(){
        System.out.println("Example of Protected Method");
    }

    public static void main(String[] args) {
        ProtectedAccessModifier protectedAccessModifier=new ProtectedAccessModifier();

        System.out.println(protectedAccessModifier.a);

        protectedAccessModifier.protectedAccessMethod();

        //Protected MEthod access modifier method ,
        // varible can be accessed in class also in Same Package not in diffrent package.
        //But can be accessed thorugh inherence relation only

    }
}
