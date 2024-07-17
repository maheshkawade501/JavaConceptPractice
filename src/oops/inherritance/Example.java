package oops.inherritance;

 class Example {

     int i;
     /*void display(){
         System.out.println(i);*/

     }



class Example2 extends Example{
     int j;


     void display(){
         super.i=j+1;
         System.out.println(j+""+i);
     }
}

class inheritance{
    public static void main(String[] args) {
        Example2 E=new Example2();
        E.i=1;
        E.j=2;
        E.display();
    }
}
