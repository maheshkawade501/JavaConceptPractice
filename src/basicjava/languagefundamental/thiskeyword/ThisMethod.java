package basicjava.languagefundamental.thiskeyword;

public class ThisMethod {

    public void method1(){
        System.out.println("method 1");
        this.method2();
        this.method3();

        /*so by using this keyword we can call other method from
        current class in 1st method only and in main method we will only 1st method
         hence chain will work and all methods get call*/
    }

    public void method2(){
        System.out.println("method 2");
          }
    public void method3(){
        System.out.println("method 3");
        this.staticMethod();//not recommended use this keyword to call static method
    }
    public static void staticMethod(){
       /* this.method2(); this key instatic methood give complie time error    */
        System.out.println("this is static Method");
    }

    public static void main(String[] args) {
    ThisMethod thisMethod=new ThisMethod();
    thisMethod.method1();
    }
}
