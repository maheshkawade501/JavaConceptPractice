package stringclassexample;

public class StringMethod {

    public static void main(String[] args) {

        String s1="Edso Services" ;

        //find out the length of string --start counting from 1
        System.out.println(s1.length());

        //CharAt method
        String s2="Edso Service" ;

        System.out.println(s2.charAt(5));

        //StringCompareto Method

        System.out.println(s1.compareTo(s2));//S1>S2 so positive number by 1 character at last position

        String s3="Sachin";
        System.out.println(s1.compareTo(s3));//although length of s1 is greater
        // but while compareing ASCII value of E and S the difference comes (83-69)==-14.
        // comparison stopped at first letter only


        //*******************************//

        //ConcatMethod

        System.out.println(s2.concat(s3));

        //Uppercase,lowercase

        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());






    }





}
