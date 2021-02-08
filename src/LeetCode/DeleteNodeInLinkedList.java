package LeetCode;

public class DeleteNodeInLinkedList {

    public static void main(String[] args) {
        deleteNode(new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9)))));
    }

    private static void deleteNode(ListNode head) {
        head.val = head.next.val;
        head.next = head.next.next;
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
