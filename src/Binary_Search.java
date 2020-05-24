public class Binary_Search {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,11,12,14,56,67,89,100};
        System.out.println(binary_search(arr, 69, 0, arr.length - 1));

    }


     public  static boolean binary_search(int[] arr,int item,int low,int high){
        if(low>high){
            return false;
        }
        int mid=(low+high)/2;
        if(arr[mid]==item){
            return true;
        }
        else if(arr[mid]>item){
            return binary_search(arr,item,low,mid-1);
        }
        else {
            return binary_search(arr,item,mid+1,high);
        }

    }

}


