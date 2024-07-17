package callby;

public class CallByReference {

int data=50;

    public void defineDate( CallByReference object){
        data=data+100;
        System.out.println(data);
    }
    public static void main(String[] args) {
        CallByReference callByReference=new CallByReference();

        System.out.println("before calling the method"+" "+callByReference.data);
        callByReference.defineDate(callByReference);//call by reference==we define object also in method and changes reflected
        // in method also outside after call
          System.out.println("after calling the method"+" "+callByReference.data);
    }
}
