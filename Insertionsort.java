package SortingAlgorithms;

public class Insertionsort {
    public static void main(String[]args){
        int[] arr ={1,5,7,10,2,7,8,5,3,9,6,4,3,};
        for(int i=1;i<arr.length;i++){
            int j = i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }

        }
        for(int ele:arr) System.out.print(ele+" ");
    }
}
