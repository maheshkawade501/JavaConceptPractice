package callby;

public class CallByValue {
    int data=50;

    public void defineDate(int data){
        data=data+100;
        System.out.println(data);
    }



    public static void main(String[] args) {
        CallByValue callByValue=new CallByValue();
        System.out.println("before calling the method"+" "+callByValue.data);
        callByValue.defineDate(200);//call by value==so we have given call in that method
        // then changes will be that method only
        System.out.println("after calling the method"+" "+callByValue.data);
    }
}
