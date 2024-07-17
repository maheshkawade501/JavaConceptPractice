package oops.finalkeyword.finalvariable;

public class FinalBlankValue {

    //without oops.finalkeyword output will be zero but if its used hen its values has to be defined in constructor

   final int a;

    FinalBlankValue(){
    a=50;
    }

    public static void main(String[] args) {

        FinalBlankValue finalBlankValue=new FinalBlankValue();

        System.out.println(finalBlankValue.a);//without oops.finalkeyword output will be zero but if its used hen its values has to be defined in construcotr
    }
}
