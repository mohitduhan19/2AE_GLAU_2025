package AE.Lec3_Lab;

class MyLinkedList {
    public static class Node{
        int data;
        Node next;
    }

    Node head;
    Node tail;
    int size;

    public int get(int idx) {
        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        } else if (idx < 0 || idx >= size) {
            System.out.println("Invalid arguments");
            return -1;
        } else {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public void addFirst(int val) {
        Node temp = new Node();
        temp.data = val;
        temp.next = head;
        head = temp;

        if(size == 0){
            tail = temp;
        }

        size++;
    }

    public void addLast(int val) {
        Node temp = new Node();
        temp.data = val;
        temp.next = null;

        if (size == 0) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }

        size++;
    }

    public void addAtIndex(int idx, int val) {
        if(idx < 0 || idx > size){
            return;
        } else if(idx == 0){
            addFirst(val);
        } else if(idx == size){
            addLast(val);
        } else {
            Node node = new Node();
            node.data = val;

            Node temp = head;
            for(int i = 0; i < idx - 1; i++){
                temp = temp.next;
            }
            node.next = temp.next;

            temp.next = node;
            size++;
        }
    }
}