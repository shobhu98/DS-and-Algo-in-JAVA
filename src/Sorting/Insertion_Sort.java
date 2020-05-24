package Sorting;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr={8,6,5,4};
        insertion_sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+", ");

        }
    }

    public static int[] insertion_sort(int[] arr){

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j >0 ; j--) {
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }

            }

        }
        return arr;

    }
}
