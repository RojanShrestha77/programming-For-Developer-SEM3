class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseInGroups {

    // Function to reverse a linked list in groups of k
    public static Node reverseInGroups(Node head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node prevGroupEnd = dummy;

        while (head != null) {
            // Check if there are k nodes in the group
            Node groupStart = head;
            Node groupEnd = head;
            for (int i = 1; i < k && groupEnd.next != null; i++) {
                groupEnd = groupEnd.next;
            }

            // If the group size is less than k, we're done
            if (groupEnd.next == null && groupStart != groupEnd) {
                break;
            }

            // Save the next group's start node
            Node nextGroupStart = groupEnd.next;

            // Reverse the current group
            reverseGroup(groupStart, groupEnd);

            // Connect the reversed group with the previous part
            prevGroupEnd.next = groupEnd;
            groupStart.next = nextGroupStart;

            // Move to the next group
            prevGroupEnd = groupStart;
            head = nextGroupStart;
        }

        return dummy.next;
    }

    // Helper function to reverse a group of nodes
    private static void reverseGroup(Node start, Node end) {
        Node prev = null;
        Node current = start;
        Node stop = end.next;

        while (current != stop) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
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
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        int k = 3; // Group size

        System.out.println("Original list:");
        printList(head);

        head = reverseInGroups(head, k);

        System.out.println("Reversed in groups of " + k + ":");
        printList(head);
    }
}
