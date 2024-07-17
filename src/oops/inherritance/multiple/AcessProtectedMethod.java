package oops.inherritance.multiple;

import oops.inherritance.ProtectedAccessModifier;

public class AcessProtectedMethod extends ProtectedAccessModifier {

    public static void main(String[] args) {
        AcessProtectedMethod acessProtectedMethod=new AcessProtectedMethod();

        acessProtectedMethod.protectedAccessMethod();
        System.out.println(acessProtectedMethod.a);

//from another package using inheritance we can access the protected Method and variable
    }

}
