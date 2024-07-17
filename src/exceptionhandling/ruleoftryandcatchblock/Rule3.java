package exceptionhandling.ruleoftryandcatchblock;

public class Rule3 {

    public static void main(String[] args) {

        //against single try block and multiple catch block

        try{
            System.out.println(10/0);
        }catch(ArithmeticException f){
            f.printStackTrace();
        }catch (NullPointerException f){
            f.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException f){
            f.printStackTrace();
        }catch (ClassCastException f){
            f.printStackTrace();
        }









    }
}
