package BST;

public class BST {
    private Node root;

    public BST(int[] arr){
        root=constructor(arr,0,arr.length-1);

    }
    private Node constructor(int[] arr,int low,int high){
        if(low>high){
            return null;
        }
        int mid=(low+high)/2;
        Node node=new Node(arr[mid]);
        node.left=constructor(arr,low,mid-1);
        node.right=constructor(arr,mid+1,high);
        return node;


    }

    public int max(){
        return max(root);
    }

    private int max(Node node){
        if(node.right==null){
            return node.value;
        }
        return max(node.right);
    }


    public int min(){
        return min(root);
    }

    private int min(Node node){
        if(node.left==null){
            return node.value;
        }
        return min(node.left);
    }
    public boolean find(int item){
        return find(root,item);
    }



    private boolean find(Node node,int item){
        if(node==null){
            return false;
        }
        if(node.value>item){
            return find(node.right,item);
        }
        else if(node.value<item){
            return find(node.left,item);
        }
        else {
            return true;
        }

    }







    private class Node{
        private Node left;
        private Node right;
        private int value;

        private Node(int value){
            this.value=value;
        }
    }
}
