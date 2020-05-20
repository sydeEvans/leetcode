package linkedList._001;

public class ReverseLinkedListSolution {

    // 迭代方案
    static ListNode solution1(ListNode head){

        if (head == null) return null;

        ListNode newHead = head;

        while (head.next != null) {
            ListNode next = head.next; // next要放到最前面去，
            head.next = next.next;

            next.next = newHead;
            newHead = next;
        }

        return newHead;
    }

    // 递归方案
    static ListNode solution2(ListNode head) {

        if (head == null) return null;

        if (head.next == null) {
            return head;
        }

        // 1 2 3 reversedLink...head.next
        // reversedLink...head.next head -> null
        ListNode reversedRestLink = solution2(head.next);
        head.next.next = head;
        head.next = null;
        return reversedRestLink;
//        reversedRestLink.next = head;
    }
}
