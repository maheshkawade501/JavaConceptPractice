package basicjava.assignmentarrays;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 4, 1, 9, 6, 8, 7};
        int min=arr[0];//first we consider 0th element is maximumn

        for (int i=1;i<arr.length;i++)///start from 1st index
        {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }

    }

