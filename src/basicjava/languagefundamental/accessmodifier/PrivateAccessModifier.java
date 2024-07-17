package basicjava.languagefundamental.accessmodifier;

public class PrivateAccessModifier {
   private int a=100;//private variabe

    private void  generalMethod(){          //private method
        System.out.println("Good Afternoon");
    }

    public static void main(String[] args) {
        PrivateAccessModifier privateAccessModifier=new PrivateAccessModifier();
        System.out.println(privateAccessModifier.a);//within a class we can access private variable
        privateAccessModifier.generalMethod();//within a class we can access the private method

    }
}
