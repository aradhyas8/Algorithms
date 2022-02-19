import java.util.*;
/**
 * Please do not modify the class/method headers. 
 */
public class Solution {
    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    /**
     * The method for you to implement.
     */
    public boolean isBalancedBinarySearchTree(TreeNode root) {
        // TODO
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        /*
         *            3
         *           / \            True
         *          2   4
         */
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(4);

        System.out.println(solution.isBalancedBinarySearchTree(root1)); // Should be true

        /*
         *            3
         *           / \
         *          2   4
         *               \         False since is not balanced
         *                6
         *                 \
         *                  7
         */
        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(4);
        root2.right.right = new TreeNode(6);
        root2.right.right.right = new TreeNode(7);

        System.out.println(solution.isBalancedBinarySearchTree(root2)); // Should be false

        /*
         *            3
         *           / \
         *          2   4         False since is not a binary search tree
         *               \
         *                1
         */
        TreeNode root3 = new TreeNode(3);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(4);
        root3.right.right = new TreeNode(1);

        System.out.println(solution.isBalancedBinarySearchTree(root3)); // Should be false
    }
}
