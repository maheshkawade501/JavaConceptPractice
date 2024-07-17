package exceptionhandling.throwkeyword;

import java.util.Scanner;

public class ThrowKeywordWithUncheckException {

    public static void checkAgeForVoting(int age) throws Exception{
        if(age >=18){
            System.out.println("the candidate is eligible for voting");
        }else {
            throw new Exception("this candidate not elegible for voting");//here exception we got so we added throws Exception on method and Main method
        }
        System.out.println("Hello Welcome for Voting");
        System.out.println("Do voting only one time");
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age");
        int age= scanner.nextInt();
        checkAgeForVoting(age);
    }
}


