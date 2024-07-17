package stringclassexample;

public class InterviewProgram {
    public static void main(String[] args) {
        String s1="Mahesh" ;
        String s2="Mahesh" ;
        String s3=new String("Mahesh") ;
        String s4=new String("Mahesh") ;

        System.out.println(s1==s2);//compares the address in memory--s1 and s2 are in String constant pool
        System.out.println(s3==s4);//compares the address in memory --s3 and s4 are in heap memory so not equals
        System.out.println(s1.equals(s2));//compares the content
        System.out.println(s3.equals(s4));//compares content

    }
}
