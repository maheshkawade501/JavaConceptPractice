package basicjava.classobject;


public class MethodExample {

    public void simpleMethod() {             //This is method user defined with no return
        System.out.println("this is simple method");
    }

    public int addition(int a, int b) {          //data parsing,giving parametere in method and returning int

        int sum;
        sum = a + b;
        return sum;
    }


    public static void main(String[] args) {
        MethodExample methodExample = new MethodExample();//creation of object of class for initiation of class

        methodExample.simpleMethod();//this is calling of method
        int additionVariable = methodExample.addition(20, 30);

        System.out.println(additionVariable);
    }
}


