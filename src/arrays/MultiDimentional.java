package arrays;

public class MultiDimentional {
    public static void main(String[] args) {
        int [][]a={{10,20,30},{40,50,60},{70,80,90}};

        //inner loop execute for columns and outer loop excute for rows
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print( " " +a[i][j]);
            }
            System.out.println();


        }
    }
}
