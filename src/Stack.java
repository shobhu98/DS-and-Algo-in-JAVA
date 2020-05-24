
// Last In Last Out

public class Stack {
    private Node head;
    private Node tail;
    private int size;

public void push(int value){
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

public void pop(){
    int value=tail.value;
    Node node=head;
    while (node.next!=tail){
        node=node.next;
    }
    node.next=null;
    tail=node;
    size--;
}
public void display(){
    Node node=head;
//    System.out.println(size);
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
