class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {

    public static Node reverse(Node head) {
        Node prev = null; // Previous node pointer
        Node current = head; // Current node pointer
        Node next = null; // Temporary pointer to store the next node

        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the link
            prev = current; // Move the previous pointer forward
            current = next; // Move the current pointer forward
        }

        return prev; // New head of the reversed list
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        head = reverse(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}
