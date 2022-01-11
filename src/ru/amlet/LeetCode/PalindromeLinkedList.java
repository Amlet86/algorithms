package ru.amlet.LeetCode;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        boolean result = isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1)))));
        System.out.println(result);
    }

    private static ListNode temp = null;

    private static boolean isPalindrome(ListNode head) {
        temp = head;
        return isPalindromeHelper(head);
        }

    private static boolean isPalindromeHelper(ListNode head) {
        if (head == null) return true;

        if (!isPalindromeHelper(head.next)) return false;

        if (temp.val != head.val) {
            return false;
        } else {
            temp = temp.next;
            return true;
        }
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
