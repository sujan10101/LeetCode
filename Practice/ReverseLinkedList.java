package Practice;

public class ReverseLinkedList {

    public static void main(String[] args) {
        // initialize nodes
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);

        // link them: 1 -> 2 -> 3 -> null
        n1.next = n2;
        n2.next = n3;

        // head points to start of list
        ListNode head = n1;

        // pass to another function
        printList(head);
    }

    // example function that traverses and prints
    static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }

    // ListNode definition
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}



