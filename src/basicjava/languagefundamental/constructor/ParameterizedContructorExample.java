package basicjava.languagefundamental.constructor;

public class ParameterizedContructorExample {

    int x;
    String name;


    //Here in thiscontructor parameter are provided in bracket
    ParameterizedContructorExample(int a,String s1){

        //provide instance variable with parameter
        x=a;
        name=s1;
        System.out.println(x+" "+ name);
    }

    public static void main(String[] args) {
 /*   To call contructor need to creat the objects along with parameter values
      and call constructor using object.contructor*/
        ParameterizedContructorExample parameterizedContructorExamples1=new ParameterizedContructorExample(107,"Mahesh");
        ParameterizedContructorExample parameterizedContructorExamples2=new ParameterizedContructorExample(108,"Kawade");



    }
}
