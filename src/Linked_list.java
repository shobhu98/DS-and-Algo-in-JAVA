public class Linked_list {
  private Node head;
  private Node tail;
  private int size;

public void  insertFirst (int value){
    Node node=new Node(value);
    node.next=head;
    head=node;
    if(size==0){
        tail=head;
    }
    size++;

}
public void insertLast(int value){
    if(size==0){
        insertFirst(value);
        return;
    }
    Node node=new Node(value);
    tail.next=node;
    tail=node;
    size++;

}

public int deleteFirst(){
    int value=head.value;
    head=head.next;
    if(head==null){
        tail=head;
    }
    size--;
    return value;
}
public int deleteLast(){
    int value=tail.value;
    Node node=head;
    while (node.next!=tail){
        node=node.next;
    }
    node.next=null;
    tail=node;
    size--;
    return value;
}
public void insert(int index,int value){
    if(index==0){
        insertFirst(value);
        return;
    }
    if(index== size){
        insertLast(value);
        return;
    }
    Node node=head;
    Node n=new Node(value);
    for (int i = 0; i <index-1 ; i++) {
        node=node.next;
    }
    n.next=node.next;
    node.next=n;
    size++;
}
public void delete(int index){

    if(index==0){
        deleteFirst();
        return;
    }
    if(index==size){
        deleteLast();
        return;
    }
    Node node=head;
    for (int i = 0; i <index-1 ; i++) {
        node=node.next;
    }
    node.next=node.next.next;
    size--;

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
        private int value;
        private Node next;


        private Node(int value){
            this.value=value;

        }

        private Node (int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
