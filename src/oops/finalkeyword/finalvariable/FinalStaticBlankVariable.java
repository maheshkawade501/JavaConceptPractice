package oops.finalkeyword.finalvariable;

public class FinalStaticBlankVariable {
//final staic blank values need to declared in static Block only
    final static int a;

    FinalStaticBlankVariable(){

    }

    static {
        a=60;
    }

    public static void main(String[] args) {
        FinalStaticBlankVariable finalStaticBlankVariable=new FinalStaticBlankVariable();

        System.out.println(a);
    }
}
