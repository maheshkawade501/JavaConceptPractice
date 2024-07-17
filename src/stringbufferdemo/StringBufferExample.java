package stringbufferdemo;

public class StringBufferExample {

    public static void main(String[] args) {
        String name="Mahesh Kawade" ;
        StringBuffer stringBuffer=new StringBuffer(name);
        System.out.println(stringBuffer.append(" is intellegent"));
        System.out.println(stringBuffer.insert(6," Vishvambhar"));
        System.out.println(stringBuffer.replace(0,6,"Nikhil"));
        System.out.println(stringBuffer.delete(0,6));
        System.out.println(stringBuffer.reverse());
    }
}
