package basicjava.loopstudy;

public class ElseIF {
    public static void main(String[] args) {
        int girlMerraigeAge = 15;
        if (girlMerraigeAge >= 18) {
            System.out.println("Girl is Eligible");
        } else if (girlMerraigeAge >= 12) {
            System.out.println("Girl is eligible for Education");

        } else if (girlMerraigeAge >= 10) {
            System.out.println("Girl is eligible for Playgroup");

        } else {
            System.out.println("Girl is not eligible");

        }

    }
}
