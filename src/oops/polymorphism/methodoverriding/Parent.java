package oops.polymorphism.methodoverriding;

public class Parent {

public void education(){
    System.out.println("Engineer");

}


public void checkTest(int a,int b){
    System.out.println(a+b);
}

public static void StaticMethod(){
    System.out.println("static");
}

    public static void main(String[] args) {
        Parent p=new Parent();
        p.education();


    }
}
