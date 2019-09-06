public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int numNodes;

    public MyLinkedList(){
    }

    public MyLinkedList(Object data){
        head = new Node(data);
    }

    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }

    public void add(int index, Object data){
        if (index == 0){
            addFirst(data);
        }else if (index >= numNodes){
            addLast(data);
        }else{
            Node temp = head;
            Node holder;

            for (int i = 0; i < index-1 && temp.next!= null; i++){
                temp = temp.next;
            }

            holder = temp.next;
            temp.next =new Node(data);
            temp.next.next = holder;
            numNodes++;
        }
    }

    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
        if (tail == null){
            tail = head;
        }
    }

    public void addLast(Object data){
        Node temp = new Node(data);
        if (tail == null){
            tail = head = temp;
        }else{
            tail.next = temp;
            tail = tail.next;
        }
        numNodes++;
    }

    public void remove(int index){
        Node temp = head;

        for (int i = 0; i < index - 1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        numNodes--;
    }

    public boolean remove(Object data){
        Node temp = head;
        for (int i = 0; i < numNodes-1; i++){
            temp = temp.next;
            if (temp.next.data == data){
                temp.next = temp.next.next;
                return true;
            }
        }
        return false;
    }

    public int size(){
        return this.numNodes;

    }

//    public Node get(int index){
//        Node temp = head;
//        for (int i = 0; i < index-1; i++){
//            temp = temp.next;
//        }
//        return temp;
//    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public boolean contains(Object data){
        Node temp = head;
        while (temp != null){
            if (temp.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(Object data){
        Node temp = head;
        int index = 0;
        while (temp != null){
            if (temp.data == data){
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public Object get(int index){
        Node temp = head;
        for (int i = 0; i< index; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    public Object getFirst(){
        Node temp = head;
        return temp.data;
    }

    public Object getLast(){
        Node temp = tail;
        return temp.data;
    }

    public void clear(){
        numNodes = 0;
        head = tail = null;
    }
}
