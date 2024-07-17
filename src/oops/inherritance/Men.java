package oops.inherritance;

public class Men extends Human {

    //with the help of extends keyword we can access the methods of Parent by creating current class object


    public static void main(String[] args) {
        Men m=new Men();

        m.walk();
        m.talk();
        m.sleep();
    }
    }


