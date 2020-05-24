
// Last In First Out
public class Queue {
    private Node head;
    private Node tail;
    private int size;

    public void insertLast(int value) {
    Node node=new Node(value);
    if(size==0){
       node.next=null;
        head=node;
        tail=head;
    }
    else {
        tail.next=node;
        tail=node;
    }
    size++;

    }

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=head;
        }
        size--;
        return val;
    }
    public void display(){
        Node node=head;
        while (node!=null){
            System.out.print(node.value+", ");
            node=node.next;
        }
        System.out.println("END");
    }















    private class Node{
        private Node next;
        private int value;

        private Node(int value){
            this.value=value;
        }
    }
}
