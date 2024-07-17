package basicjava.languagefundamental.accessmodifier;

public class TestExample {

    public static void main(String[] args) {
        //accessing the defoult main method and defould variable from another class but from same package

        DefoultAccessModifier defoultAccessModifier=new DefoultAccessModifier();
        System.out.println(defoultAccessModifier.a);
               defoultAccessModifier.NormalMethod();
    }
}
