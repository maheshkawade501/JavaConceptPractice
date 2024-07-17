package basicjava.assignmentloops;

public class NaturalNumber {
    public static void main(String[] args) {
        int a = 1;int sumTotal=0;

        while (a <= 10) {
             sumTotal=a+(sumTotal);
                      a++;
        }
        System.out.println(sumTotal);
    }
}
