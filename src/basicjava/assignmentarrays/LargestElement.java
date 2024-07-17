package basicjava.assignmentarrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 2, 9, 6, 8, 7};
        int max=arr[0];//first we consider 0th element is maximumn

        for (int i=1;i<arr.length;i++)///start from 1st index
        {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
