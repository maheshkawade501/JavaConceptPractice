package basicjava.languagefundamental.accessmodifier;

public class MainMethodExample {

    //a java program take only single method in a class

   /* public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//to enter command line argument as main method has these String[] argument
        //Program takes the runtime input to compile next line of code

        System.out.println("Please enter your name");
        String name=scanner.nextLine();

        System.out.println("this name you entered");
    }*/

    //we can change the args from main method same can be accepted == as main method

   /* public static void main(String[] Mahesh) {
        System.out.println("Mahesh");
    }*/

    //in main method Array of string only accepted if we use diffrent datatype then it will be userdefined method

/*    public static void main(int[] args) {

    }*/

//main is mandatory to cosider main method
   //static keyword also reuired
    //below is valid Main method we can interchange the public and static
    //Void and main should be same sequence

     static public void main(String[] args) {
         System.out.println("Main method");
    }


}
