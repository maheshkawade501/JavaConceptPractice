package stringclassexample;

public class ImmutableString {
    public static void main(String[] args) {
        String s1="Mahesh" ;

        s1="Kawade" ;

        String s2="Mahesh" ;//Same memory will be allocated to String from String constant pool
        String s3="Mahesh" ;
        String s4="Mahesh" ;
                s4="Kawade" ;//New memory allocated to new string
        System.out.println(s1);

        System.out.println(s2 == s3);
    }
}
