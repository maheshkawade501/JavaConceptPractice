package basicjava.literal;

public class Literal {
    public static void main(String[] args) {
        int a = 123456;//Decimal basicjava.literal having number 0 to 9

        int b = 0723;/* octal basicjava.literal as started with 0 and
             console has differant value because
              java convert octal basicjava.literal to decimal by calculation--7*8^2+2*8^1+3*8^0  */

        int c =0x98abef;//Hexadecimal basicjava.literal it has 0to9 and ato f (10,11,12,13,14,15)
                        // and start with 0X,9*16^5+8*16^4+10*16^3+11*16^2+14*16^1+15*16^0

       int d=0b10;//Binary Literal Start with 0b ==1*2^1+0*2^0


        //Char basicjava.literal refer ASCII table 65 to 90 are Ato Z and 97 to 122 are a to z

        char e=70;//in ascii for 70 its F
        char f='r';
        String name ="Mahesh Kawade";



        System.out.println(a);
        System.out.println(b);
        System.out.println((c));
        System.out.println(d);
        System.out.println(e+f);//70+114
        System.out.println(name);

        //Backlash Literal
        System.out.println("Hello \n Morning");
        System.out.println("Helllo \t Morning");
        System.out.println("\'Hello\'");
        System.out.println("\"Morning\" ");




    }
}
