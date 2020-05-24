package Queue;

public class Queue {
    private int size;
    private Node head;

    public void insertLast(int value){
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

    public void display(){
        Node node=head;
        while (node!=null){
            System.out.print(node.value+", ");
            node=node.next;
        }
        System.out.println("\b END");
    }
    public void  deleteFirst(){
        Node node=head;
        while (node.next.next!=null){
            node=node.next;
        }
        System.out.println(node.next.value);
        node.next=null;
        size--;
    }








    private class Node{
        private int value;
        private Node next;

        private Node(int value){
            this.value=value;
        }
    }
}
