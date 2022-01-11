package ru.amlet.LeetCode;

public class RemoveLinkedListElements {

    public static void main(String[] args) {
        removeElements(new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null))))))), 6);
    }

    private static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode result = head;

        while (result != null && result.next != null) {
            if (result.next.val == val) {
                result.next = result.next.next;
            } else {
                result = result.next;
            }
        }

        return head;
    }

    private static class ListNode {
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
