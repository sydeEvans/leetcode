package linkedList._001;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
  class linkedList._001.ListNode {
      int val;
      linkedList._001.ListNode next;
      linkedList._001.ListNode(int x) {
          val = x;
          next = null;
      }
  }
 */

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    static ListNode formArray(int[] array) {
        ListNode head = null;
        ListNode tmp = null;
        for (int i : array) {
            if (head == null) {
                head = new ListNode(i);
                tmp = head;
            }else {
                tmp.next = new ListNode(i);
                tmp = tmp.next;
            }
        }

        return head;
    }

    static Integer[] toArray(ListNode head){
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }


        Integer[] arr = new Integer[list.size()];
        return list.toArray(arr);
    }

    static void printListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
        }
    }
}
