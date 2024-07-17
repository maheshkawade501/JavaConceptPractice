package exceptionhandling.ruleoftryandcatchblock;

public class Rule5 {
    //If we are having the muliple statement in try block e.g. 3 statement
    //but we got error on 2nd statement so try block terminate and our 3rd statement wont be executed

    public static void main(String[] args) {

try{
        System.out.println("hello");
        System.out.println(10/0);
        System.out.println("Good Morning");

   }catch (ArithmeticException a){
    a.printStackTrace();
   }
}



}

