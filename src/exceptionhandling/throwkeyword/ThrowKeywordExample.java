package exceptionhandling.throwkeyword;

import java.util.Scanner;

public class ThrowKeywordExample {
//if we enter the age below 18 will get exception
    public static void checkAgeForVoting(int age){
        if(age >=18){
            System.out.println("the candidate is eligible for voting");
        }else {
            throw new RuntimeException("this candidate not elegible for voting");
        }
        System.out.println("Hello Welcome for Voting");
        System.out.println("Do voting only one time");
            }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age");
        int age= scanner.nextInt();
        checkAgeForVoting(age);
    }
}
