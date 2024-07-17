package basicjava.operator;

public class LogicalOperaor {
    public static void main(String[] args) {
        // double and &&

        int a=100,b=200,c=300,d=400;

        System.out.println(a<b && c<d);//first condition true and true then answer true

        System.out.println(a>b && c<d);//first condition false and true then answer true

        //or ||

        System.out.println(a<b || c>d);//first true or second false then answer true


    }
}
