package oops.encapsulation;

public class ImplementedExample {
//We are hiding data from readonlyClass this is encapsulation
    public static void main(String[] args) {
      /*  ReadOnlyClass readOnlyClass = new ReadOnlyClass();
        System.out.println(readOnlyClass.getA());
        System.out.println(readOnlyClass.getName());*/

        WriteOnlyClass writeOnlyClass=new WriteOnlyClass();
        writeOnlyClass.setX(10);
        writeOnlyClass.setEmpName("Mahesh");


    }
}
