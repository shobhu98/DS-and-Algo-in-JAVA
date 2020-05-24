public class BST_client {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        BST bst=new BST(arr);
        bst.display();
        System.out.println(bst.max());
        System.out.println(bst.min());
    }
}
