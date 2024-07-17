package basicjava.assignmentpattern;

public class Pattern2 {
    public static void main(String[] args) {

        for(int i=1;i<8;i++)
        {
            for(int j=8;j>8-i;j--)
            {
                System.out.print(" ");
            }
            for(int j=8;j>i;j--)
            {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
