package Sorting;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2};
                mergeSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);

        }
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length<=1){
//            System.out.println("l");
            return arr;
        }
        int mid=(arr.length)/2;
        int[] first= Arrays.copyOfRange(arr,0,mid);
        int[] second=Arrays.copyOfRange(arr,mid,arr.length);

        first=mergeSort(first);
        second=mergeSort(second);
        return merge(first,second);
    }

    private static int[] merge(int[] first, int[] second) {
//        System.out.println("M");
        int[] result= new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<first.length&&j<second.length){
            if(first[i]<second[j]){
                result[k++]=first[i++];
            }
            else {
                result[k++]=second[j++];
            }

        }
        while (i<first.length){
            result[k++]=first[i++];
        }
        while (j<second.length){
            result[k++]=second[j++];
        }
        return result;



    }
}
