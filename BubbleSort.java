package SortingAlgorithms;

public class BubbleSort {

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 8, 7, 35,2};

        int n = arr.length;
        print(arr);
//        for (int j = 1; j <= n - 1; j++) {// n-1 passes
//            for (int i = 0; i < n - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//           }

        //Bubble sort 2 approch
        for (int j = 1; j <= n - 1; j++) {// n-1 passes
            int swaps=0;

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swaps++;
                }
            }
            if(swaps==0)break;
        }
        print(arr);
    }
}





