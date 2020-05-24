package Searching;
import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("Enter the number to be found");
        int num=s.nextInt();
        System.out.println(binary_Search(arr, num, 0, n - 1));


    }
    public static boolean binary_Search(int[] arr,int n,int low,int high){
        if(low>high){
            return true;
        }
        int mid=(low+high)/2;
        if(arr[mid]==n){
            return true;
        }
        else if(n>arr[mid]){
            return binary_Search(arr,n,mid+1,high);
        }
        else {
            return binary_Search(arr,n,low,mid-1);
        }

    }
}
