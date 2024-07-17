package arrays;

public class ArreyHomework {
    public static void main(String[] args) {
        int a[][]={{10,20,30,40},{50,60,70,80},{90,100,101,102}};
//as we have 4 column and 3 rows so length of arrey is 3 that will be represented in outer loop
// but in inner loop we need to add extra 1 in length for columns
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length+1;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
}
