package basicjava.languagefundamental.thiskeyword;

public class WithThisKeyword {

    int a, b;

    WithThisKeyword(int a, int b) {
        //using this keyword contructor is getting knowledge that current class variable and parameter are not diffret
        //this keyword refers to current class insatnce variable
       this.a = a;
       this.b = b;

    }

    public void show() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {

        WithThisKeyword withThisKeyword = new WithThisKeyword(10, 20);
        withThisKeyword.show();//calling of show method
    }
}