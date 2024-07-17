package oops.encapsulation;

public class WriteOnlyClass {

//class having only setter are called writeonly class
    //By using setter we can assign the values to pravate ariable and private method from outside of the class
    private int x;

    private String empName;

    public void setX(int x) {
        this.x = x;
        System.out.println(x);
    }

    public void setEmpName(String empName) {
        this.empName = empName;
        System.out.println(empName);
    }
}
