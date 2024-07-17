package exceptionhandling.ruleoftryandcatchblock;

public class Rule8 {
//We can define child class exception at the top and parent class below

    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException a) {
            a.printStackTrace();
        } catch (NullPointerException n) {
            n.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 }
