package LeetCode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null))))));
    }

    private static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode result = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return result;
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
