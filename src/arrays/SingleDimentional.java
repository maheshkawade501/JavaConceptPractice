package arrays;

public class SingleDimentional {
    public static void main(String[] args) {
        int []x; //array declaration
        x =new int[5];//array length/size declarion
        x[0]=1;//values declarion on index
        x[1]=2;
        x[2]=3;
        x[3]=4;
        x[4]=5;
//printing entire arreys
        for(int a:x){
            System.out.println(a);
        }

        System.out.println("*************");
        System.out.println(x[2]);//perticular index value
        System.out.println(x.length);//printing length of arrey

        System.out.println("*****************");

        //aother simple method for arrays

        int[]y={10,20,30,40,50};
        /*for(int b:y){
            System.out.println(b);
        }*/

        //another method for printing arrey using for loop
        for(int i=0;i<y.length;i++){
      /*      System.out.println(i);//it will print the index

           */

            System.out.println((y[i]));//it will print the arrey
                    }
        System.out.println("***********");
        System.out.println(y[3]);
        System.out.println("***********");

        //char string can take integer as it get converted into ascii value and it gets printes
        //similary int can take char as it is small datatype
        //so bigger datatype size wise can take smaller datatype value in arrey
        char []c={'a','b','c','d',100};

        for( char j=0;j<c.length;j++){
            System.out.println(c[j]);
        }

    }
}
