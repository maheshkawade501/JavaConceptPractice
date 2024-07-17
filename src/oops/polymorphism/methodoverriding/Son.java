package oops.polymorphism.methodoverriding;

public class Son extends Parent {

    @Override
    public void education() {
        System.out.println("Doctor");
    }

    @Override
    public void checkTest(int a, int b) {
        System.out.println(a + b);
    }


    public static void main(String[] args) {
        Son son = new Son();

        son.education();
    }
}
