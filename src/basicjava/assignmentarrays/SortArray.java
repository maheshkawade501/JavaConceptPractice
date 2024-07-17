package basicjava.assignmentarrays;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 4, 1, 9, 6, 8, 7};

//outer loop run for passes
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1 ; j++) {
                if (arr[j] > arr[j + 1]) {          //next index value compared
                    int temp = arr[j]; //j variable stored in temp variable
                    arr[j] = arr[j + 1];//j+1 variable stored in j variable
                    arr[j + 1] = temp;//j+1 stored in temp so basically we are swaping smaller next element to greater element
                }
            }

        }
        //to print the new values
        for (int k = 0; k < arr.length; k++) {
            System.out.print(" "+arr[k]);
        }
    }
}
