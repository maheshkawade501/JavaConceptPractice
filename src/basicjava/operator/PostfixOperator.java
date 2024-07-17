package basicjava.operator;

public class PostfixOperator {

    public static void main(String[] args) {
        //VERY IMP Java Execute Top to Bottom and Left to Right
        //Unary basicjava.operator---always on variable only
        //Postfix incremental---First value Assign then increment the variable on which ++ basicjava.operator

        int a=100;
        int b=a++;
        int c=b;
        int d=a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        System.out.println("*****************************");
        //Post fix decrimental==First value assign then decrement

        int e=100;
        int f=e--;
        int g=f;
        int h=e;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);


    }
}
