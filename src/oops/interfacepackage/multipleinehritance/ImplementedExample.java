package oops.interfacepackage.multipleinehritance;

public class ImplementedExample implements  Circle,Triagle{

//both the interfaces having same methods,or diferernt metjhod
// so multiple inheritance achved here bu need to implement it
    @Override
    public void radius() {
        System.out.println("Radius");
    }

    @Override
    public void lengthExample() {

        System.out.println("Length");

    }

    public static void main(String[] args) {
        ImplementedExample implementedExample=new ImplementedExample();
        implementedExample.radius();
        implementedExample.lengthExample();
    }
}
