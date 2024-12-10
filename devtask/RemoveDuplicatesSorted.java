class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicatesSorted {

    // Function to remove duplicates from a sorted linked list
    public static void removeDuplicates(Node head) {
        if (head == null) {
            return;
        }

        Node current = head;

        // Traverse the list
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                // Skip the duplicate node
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }
    }

    // Utility function to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a sorted linked list: 1 -> 1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next.next = new Node(5);

        System.out.println("Original list:");
        printList(head);

        removeDuplicates(head);

        System.out.println("List after removing duplicates:");
        printList(head);
    }
}
