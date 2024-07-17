package oops.encapsulation;

public class ReadOnlyClass {

//class having getter are called Read only class
//to access private variable and private method outside of the class we use Getters
private int a=10;

    private String name="Mahesh";

    public int getA() {
        return a;
    }

    public String getName() {
        return name;
    }


 /*
    *//*public int getA(){
        return this.a;
    }

    public String getName(){
        return this.name;*//*
    }*/


}
