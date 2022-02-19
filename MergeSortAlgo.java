public class Solution {
    /**
     * The definition for the linked list. DO NOT modify this class.
     */
    public static class ListNode {
        int value;
        ListNode next;
        ListNode(int value) {
            this.value = value;
        }
    }
    /**
     * Merges two sorted lists.
     */
    private ListNode merge(ListNode l1, ListNode l2) {
        // TODO You can copy and paste the merge() method from Assignment 1.
        return null;
    }

    /**
     * Make use of the merge() method in Assignment 1 to implement the merge 
     * sort algorithm.
     * 
     * DO NOT change the method header.
     */
    public ListNode mergeSort(ListNode list, int size) {
        // TODO The method for you to implement
        return null;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        Solution solution = new Solution();
        ListNode result = solution.mergeSort(node1, 5);
        // The output should be 2, 4, 4, 5, 8,
        while (null != result) {
            System.out.print(result.value + ", ");
            result = result.next;
        }
    }
}
