/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode cur;
    
    public TreeNode increasingBST(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
        return root;

        TreeNode dummy = new TreeNode(0);
        cur = dummy;

        inorder(root);

        return dummy.right;
    }

    public void inorder(TreeNode root){
        if (root == null)
        return;

        inorder(root.left);
        
        root.left = null;
        cur.right = root;
        cur = root;

        inorder(root.right);
    }
}