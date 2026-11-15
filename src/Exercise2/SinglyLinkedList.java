package Exercise2;

/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 *
 * Your Name:        Fatma Kübra Sağlam
 * Your Student ID:  250444023
 * Your Date:        15.11.2026
 */

public class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public void deleteMiddle() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        int middleIndex = count / 2;
        Node prev = head;
        for (int i = 0; i < middleIndex - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    public Node getHead() {
        return head;
    }
}