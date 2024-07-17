package basicjava.assignmentloops;

public class PrimeNumber {
    public static void main(String[] args) {
        //Write a program to check whether the number is a prime number.
        //Natural number >1 and divisible by only two factors 1 and itself
        int num = 3;//number to chek whether prime
        int count=0;//how many number of factors are there for the number
        if(num>1){
            for(int i=1;i<=num;i++){
                if(num%i==0)
                    count++;
            }
            if(count==2){
                System.out.println(num+" "+"is prime number");
            }
            else{
                System.out.println(num+"is not prime number");
            }

        }
        else {
            System.out.println("Not Prime Number");
        }
    }
}
