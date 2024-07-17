package basicjava.loopstudy;

public class BreakStatemeninLoop {
    public static void main(String[] args) {
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                if (k == 2) {
                    break;//if break is used in nested loop then it will not affect the outer loop
                }
                System.out.println(j + " " + k);
            }
        }
    }
}
