package Stack;

public class Stack {
    private int size;
    private Node head;

    public void push(int value){
        Node node=new Node(value);
        if(size==0){
            node.next=null;
            head=node;
            size++;
        }
        else {
            node.next=head;
            head=node;
            size++;
        }

    }
    public void pop(){
        int value=head.value;
        head=head.next;
        size--;
        System.out.println(value);
    }

    public void display(){
        Node node=head;
        while (node!=null){
            System.out.print(node.value+", ");
            node=node.next;
        }
        System.out.println("\bEnd");
        System.out.println();
    }







    private class Node{
        private int value;
        private Node next;

        private Node(int value){

            this.value=value;
        }

    }
}
