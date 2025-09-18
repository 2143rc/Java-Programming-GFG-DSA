package SortingAlgorithms;

public class BubbleSort2approch {
    //BUBBLE SORT OPTIMISED
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 8, 7, 2, 85, 90,95,100,200};

        int n = arr.length;

        for (int i = 1; i<n - 1; i++) {// n-1 passes
            boolean isSorted = true;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j+ 1]) {
                     isSorted=false;
                     break;

                }
            }
            if (isSorted==true) break;
            for (int j=0;j<n-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        print(arr);
    }
}
