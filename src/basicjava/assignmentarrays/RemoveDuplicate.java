package basicjava.assignmentarrays;
//a program to remove duplicates from an array
public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {2, 5, 2, 4, 1, 3, 6, 8, 6};

        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                }
            }
        }
        System.out.println();
        System.out.println("removed array is :");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                System.out.print("\t" + arr[i]);
            }

        }
    }
}
