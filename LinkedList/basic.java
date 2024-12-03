package LinkedList;

public class basic {
    
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        printLL(head);
        System.out.println();
        Node getData = test(head);
        printLL(getData);
        System.out.println();
        printLL(head);


    }

    static Node test(Node head) {

        Node temp = head.next.next.next;
        temp.next = null;
        return head;
        // printLL(head);
    }

    static void printLL(Node head) {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
    }
}
