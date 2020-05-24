package Sorting;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr={8,7,6,5};
        selection_sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);

        }
    }
    public static int[] selection_sort(int[] arr){
        int lowest_index;
        for (int i = 0; i <arr.length-1 ; i++) {
            lowest_index=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[lowest_index]){
                    lowest_index=j;
                }

            }
//            System.out.println("a");
            int temp=arr[i];
            arr[i]=arr[lowest_index];
            arr[lowest_index]=temp;
//            System.out.println(lowest_index);
        }
return arr;
    }
}
