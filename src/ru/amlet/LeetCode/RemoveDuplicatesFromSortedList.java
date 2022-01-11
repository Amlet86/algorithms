package ru.amlet.LeetCode;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3))))));
    }

    private static ListNode deleteDuplicates(ListNode head) {
        ListNode iterator = head;

        while (iterator != null && iterator.next != null) {
            if(iterator.val == iterator.next.val) {
                iterator.next = iterator.next.next;
            } else {
                iterator = iterator.next;
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
