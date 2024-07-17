package oops.inherritance.multilevel;

public class Father extends GrandFather{

    public void car(){
        System.out.println("Swift");
    }

    public static void main(String[] args) {
        Father father=new Father();

        father.farm();
    }
}
