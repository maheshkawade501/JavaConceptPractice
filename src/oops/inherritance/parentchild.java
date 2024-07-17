package oops.inherritance;


class Parent{
    public  void method(){
        System.out.println("i am the parent");
    }
}
public class parentchild extends Parent{

  /*  void method() {
        System.out.println("i am the child");
    }*/

    public static void main(String[] args) {

        parentchild parentchild=new parentchild();

        parentchild.method();
    }

    }

