package basicjava.operator;

public class PrefixOperator {
    public static void main(String[] args) {
        //Prefix Incremetal basicjava.operator==first increase th value then assign

        int a=100;
        int b=++a;
        int c=b;
        int d=c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println("***********************");
        //Prefix decremental basicjava.operator==first decrease then assign the value

        int e=100;
        int f=--e;
        int g=f;
        int h=e;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println("***********************");
        boolean m=false;
        m = !m;
        System.out.println(m);
    }
}
