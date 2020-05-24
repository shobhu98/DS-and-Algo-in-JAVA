import java.util.Scanner;

public class Binary_tree {
    private Node root;
    Scanner s=new Scanner(System.in);

      Binary_tree(){
          root=takeInput(null,false);
      }

    public Node takeInput(Node parent,Boolean isleftright){
          if(parent==null){
              System.out.println("enter the value of the parent ");
          }
          else {
              if(isleftright){
                  System.out.println("enter the value of left child of"+parent.value);
              }
              else {
                  System.out.println("enter the value of right child of"+parent.value);
              }
          }
          int value=s.nextInt();
          Node node=new Node(value,null,null);
        System.out.println("do you have left child of"+node.value);
        boolean choice=s.nextBoolean();
        if(choice){
            node.left=takeInput(node,true);

        }
        System.out.println("do you have right child  of "+node.value);
        choice=s.nextBoolean();
        if(choice){
            node.right=takeInput(node,false);
        }
        return node;



    }

    public void preOrder() {
        preOrder(this.root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + ",");
        preOrder(node.left);
        preOrder(node.right);

    }



    private class Node{
        private Node left;
        private Node right;
        private int value;

        private Node(int value,Node left,Node right){
            this.value=value;
            this.left=left;
            this.right=right;

        }
    }
}
