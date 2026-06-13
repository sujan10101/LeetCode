package Practice;

public class AddTwoNumberLinkedList
{

    // LeetCode-style ListNode
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static void main(String[] args) {

        ListNode l1 = new ListNode(9);
        ListNode curr1 = l1;
        for (int i = 0; i < 6; i++) {   // already have first 9, add 6 more
            curr1.next = new ListNode(9);
            curr1 = curr1.next;
        }


        ListNode l2 = new ListNode(9);
        ListNode curr2 = l2;
        for (int i = 0; i < 3; i++) {   // already have first 9, add 3 more
            curr2.next = new ListNode(9);
            curr2 = curr2.next;
        }

        ListNode result = addTwoNumbers(l1, l2);

        // print result list
        printList(result);
    }



    public static int length(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

//        ListNode s = l1;
//        ListNode t = l2;
//
//        int lengths1 = length(s);
//        int lengtht1 = length(t);
//        int i = Math.max(lengths1, lengtht1);
//
//        /*
//        *
//        *
//        *    2 4 3
//        *    5 6 4
//        *    7 10 7
//        *    7 0  7+1
//        */
//
//        int k = 0;
//        int b = 0;
//        int v;
//        while(b  <  i){
//            if (s == null) {
//                v = t.val + k;
//            }
//
//            else if (t == null) {
//                v = s.val + k;
//            }
//
//            else {
//               v =  s.val + t.val + k;
//            }
//
//
//            int u = v/10;
//            int g = v % 10;
//
//            System.out.println(g);
//            if(u < 1){
//              k = 0;
//            }
//            else {
//               k = 1;
//            }
//
//            if(s != null){
//                s = s.next;
//            }
//
//            if(t != null){
//                t = t.next;
//            }
//
//          b++;
//        }
//        if(lengths1 != lengtht1){
//            System.out.println(k);
//        }
//
//
//
//        return new ListNode();


        ListNode s = l1;
        ListNode t = l2;

        int lengths1 = length(s);
        int lengtht1 = length(t);
        int i = Math.max(lengths1, lengtht1);

        int k = 0; // carry
        int b = 0;

        // dummy head for result list
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (b < i) {
            int v;

            if (s == null) {
                v = t.val + k;
            } else if (t == null) {
                v = s.val + k;
            } else {
                v = s.val + t.val + k;
            }

            int u = v / 10;   // new carry
            int g = v % 10;   // digit

            // instead of System.out.println(g), create a node
            tail.next = new ListNode(g);
            tail = tail.next;

            k = u; // carry 0 or 1

            if (s != null) s = s.next;
            if (t != null) t = t.next;

            b++;
        }

        // after loop, if carry remains, append it
        if (k > 0) {
            tail.next = new ListNode(k);
        }

        return dummy.next;
    }



    // helper to print a linked list
    private static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            curr = curr.next;
        }
    }
}
