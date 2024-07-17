package basicjava.loopstudy;

public class DoWhileLoop {
    public static void main(String[] args) {
        //ist condiotion fail still once we want to execurte and we dont
        // know how many times the iteration will happen in that can we use Do while loop

        int a=10;

                do {
                    System.out.println(a);
                    a++;
                }
                while (a<10);//here we need to give semicolon post while
    }
}
