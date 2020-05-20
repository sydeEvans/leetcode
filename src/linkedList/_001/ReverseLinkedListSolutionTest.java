package linkedList._001;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListSolutionTest {

    @org.junit.jupiter.api.Test
    void solution1() {

        int[] arr = {7, 1, 3, 4, 5};
        ListNode head = ListNode.formArray(arr);

        ListNode reverseLink = ReverseLinkedListSolution.solution1(head);
//        ListNode.printListNode(reverseLink);

        Integer[] arr2 = ListNode.toArray(reverseLink);

        assertArrayEquals(arr2, new Integer[]{5, 4,3,1,7});
    }

    @Test
    void solution2() {

        int[] arr = {7, 1, 3, 4, 5};
        ListNode head = ListNode.formArray(arr);

        ListNode reverseLink = ReverseLinkedListSolution.solution2(head);

        ListNode.printListNode(reverseLink);
    }
}