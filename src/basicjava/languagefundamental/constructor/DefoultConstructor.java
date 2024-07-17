package basicjava.languagefundamental.constructor;

public class DefoultConstructor {
    int a;
    boolean b;

/*  if we dont provide constructor still the variable values are initialised--
    as Java complier create the defould constructor in class file,we can in out folder*/
    //below is the syntax
    public DefoultConstructor(){
    }

    public static void main(String[] args) {
        DefoultConstructor defoultConstructor=new DefoultConstructor();

        System.out.println(defoultConstructor.a);
        System.out.println(defoultConstructor.b);
    }
}
