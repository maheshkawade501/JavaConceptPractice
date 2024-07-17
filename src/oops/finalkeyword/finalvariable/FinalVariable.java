package oops.finalkeyword.finalvariable;

public class FinalVariable {
   final  int a=50;
   //value of variable with final keyword can not be changed/can not be assigned as well in any method

    final static int b=100;  //static with final can not be changed/can not be assigned as well in any method

    FinalVariable(){

           }

    public static void main(String[] args) {
        FinalVariable finalVariable=new FinalVariable();
        System.out.println(finalVariable.a);
    }

}
