package Linked_List;

public class Linked_list_Client {
    public static void main(String[] args) {
        Linked_list list=new Linked_list();
        list.insertFirst(1);
        list.insertLast(2);
        list.insertFirst(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();
        list.deleteFirst();
        list.deleteLast();
        list.display();
        list.insert(2,34);
        list.display();
        list.delete(1);
        list.display();
    }
}
