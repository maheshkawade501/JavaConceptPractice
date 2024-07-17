package basicjava.languagefundamental.accessmodifier;

public class DefoultAccessModifier {

    int a=10;
    //if no access modifier provided then its defould access modifier applied by java,
    // no need to provide seperate keyword and it wont take it
    void NormalMethod(){
        System.out.println("this is default method");
        }

    public static void main(String[] args) {
        DefoultAccessModifier defoultAccessModifier=new DefoultAccessModifier();
        System.out.println(defoultAccessModifier.a);
        /*we can acceess the defould variable or method in same class
        also outside of class but in same package*/
        defoultAccessModifier.NormalMethod();
    }
}
