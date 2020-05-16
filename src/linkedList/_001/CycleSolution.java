package linkedList._001;

import java.util.HashSet;

/**
 * 链表是否有环的实现，
 */
public class CycleSolution {

    // 判断链表是否有环：Hash表实现
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();

        if (head == null) return  false;

        while (head.next != null) {
            if (set.contains(head)) return true;
            set.add(head);
            head = head.next;
        }

        return false;
    }

    // 判断是否有环，并获取环的起点： Hash表实现
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();

        if (head == null) return null;

        while (head.next != null) {
            if (set.contains(head)) return head;
            set.add(head);
            head = head.next;
        }

        return null;
    }
}