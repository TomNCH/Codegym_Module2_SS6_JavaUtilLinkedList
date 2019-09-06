public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(0,"A");
        myLinkedList.add(1,"B");
        myLinkedList.add(2,"C");
        myLinkedList.add(3,"D");
        myLinkedList.add(4,"E");

        myLinkedList.printList();
        System.out.println("--------------------");
        myLinkedList.remove(1);
        myLinkedList.remove("D");

        myLinkedList.printList();

        System.out.println("--------------------");
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());

        System.out.println("--------------------");
        myLinkedList.clear();
        myLinkedList.printList();
    }
}
