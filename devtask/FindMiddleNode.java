public class FindMiddleNode {
    
}
public class FindMiddleNode {

    public static Node findMiddle(Node head) {
        if (head == null) {
            return null;
        }

        Node slow = head, fast = head;

        // Move slow by one step and fast by two steps
        while (fast != null && fast.next != null) {
            slow = slow.next;`      
            fast = fast.next.next;
        }

        // Slow is now at the middle
        return slow;
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Find the middle node
        Node middle = findMiddle(head);
        System.out.println("The middle node is: " + (middle != null ? middle.data : "None"));
    }
}
