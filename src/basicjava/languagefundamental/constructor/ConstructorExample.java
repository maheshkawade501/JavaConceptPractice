package basicjava.languagefundamental.constructor;

public class ConstructorExample {

    //in method we provide return type like void,int but in contructor we don't specify the return type
    //dont provide any keyword to constructor but we can provide access modifier
    int a;//instance variable without the value
static int b;
    ConstructorExample() {
         a=100;//given vlue to instance variable
        b=200;
        System.out.println("this is constructor");
    }

    public static void main(String[] args) {
        //to call the constructor we need to create the Object of class
        //by just creating the object we can call the Constructor no need to give object.constructor name
        ConstructorExample constructorExample = new ConstructorExample();

        //to ititialise the value  variable we use the constructor
        System.out.println(constructorExample.a);
        System.out.println(b);//as b is static no need to give object
    }
}
