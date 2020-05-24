public class Linkedlist_Client {
    public static void main(String[] args) {
        Linked_list list=new Linked_list();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertLast(4);
        list.insert(3,7);

        list.display();
       list.delete(2);
       list.display();




    }
}
