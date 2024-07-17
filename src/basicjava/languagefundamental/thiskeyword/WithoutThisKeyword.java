package basicjava.languagefundamental.thiskeyword;

public class WithoutThisKeyword {

    int a,b;
    WithoutThisKeyword(int a,int b){
        a=a;
        b=b;
       /* System.out.println(a);
        System.out.println(b);*/
    }

public void show() {
    System.out.println(a);
    System.out.println(b);
}

    public static void main(String[] args) {

        WithoutThisKeyword withoutThisKeyword=new WithoutThisKeyword(10,20);
        withoutThisKeyword.show();//calling of show method

    }
}

//the output coming 0 0 becouse java compiler confuses the variable and parameter as same so output is defoult value
// if we give diffrent parameter in construcotr it will work