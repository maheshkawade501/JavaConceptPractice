package exceptionhandling.ruleoftryandcatchblock;

public class Rule6 {
    //When we dont know which exception we get we can directly define Exception(Parent Class)
    public static void main(String[] args) {


        try{

            System.out.println(10/0);

        }catch (Exception a){
            a.printStackTrace();
        }

        System.out.println("Hi");



    }

}
