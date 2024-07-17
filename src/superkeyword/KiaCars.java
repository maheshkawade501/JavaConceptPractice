package superkeyword;

public class KiaCars extends HyundaiCar{
//super keyword refer parent class vriable,method,constructor

    String Performance="fine";

    String milage="fine";

    KiaCars(int a ,int b){
        super(10,20);//called parent class constructor and givn values
    }
    void show(){

        System.out.println(super.Performance);
        super.normalMethod();

    }
//we cant user super in static method
    public static void main(String[] args) {
       /* KiaCars kiaCars=new KiaCars();*/
        KiaCars kiaCars=new KiaCars(20,30);
                    kiaCars.show();

    }
}
