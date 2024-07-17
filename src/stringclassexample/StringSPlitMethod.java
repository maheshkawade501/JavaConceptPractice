package stringclassexample;

public class StringSPlitMethod {

    public static void main(String[] args) {
        String name="Mahesh Vishvambhar Kawade" ;

        //using split() it will create arrey that need to defined and accessed
        String[] splittedname =name.split(" ");
        for (String s:splittedname)
              {
            System.out.println(s);
        }

    }
}
