package LeetCode;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        mergeTwoLists(new ListNode(5),
            new ListNode(1, new ListNode(2, new ListNode(4))));
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode tail = l3;
        while (true) {
            if (l1 == null) {
                tail.next = l2;
                break;
            }

            if (l2 == null) {
                tail.next = l1;
                break;
            }

            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        return l3.next;
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
