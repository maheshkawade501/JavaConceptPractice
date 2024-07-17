package stringclassexample;

public class TrimMethod {
    public static void main(String[] args) {
        String name="  Mahesh Kawade  ";

        System.out.println("Before Trim");
        System.out.println(name);
        System.out.println("After Trim");
        System.out.println(name.trim());//Middle spaces will not be removed
    }
}
