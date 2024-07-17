package exceptionhandling.finallyblock;

public class Rule13 {

    public static void main(String[] args) {
        //for each try block there can be zero or multiple catch block but ony one final block
        /*try {
            System.out.println(10 / 0);
        } catch (ArithmeticException a) {
            a.printStackTrace();
        } catch (NullPointerException n) {
            n.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("1st finally");
        }finally{
            System.out.println("2nd finally");          //compile time error
        }*/
    }
}
