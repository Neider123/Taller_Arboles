package Problema3;

 public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }

class Solution {
    private Integer prev;

    public boolean isValidBST(TreeNode root) {
        prev = null;
        return inorderTraversal(root);
    }

    private boolean inorderTraversal(TreeNode node) {
        if (node == null)
            return true;

        if (!inorderTraversal(node.left))
            return false;

        if (prev != null && node.val <= prev)
            return false;

        prev = node.val;

        return inorderTraversal(node.right);
    }
}