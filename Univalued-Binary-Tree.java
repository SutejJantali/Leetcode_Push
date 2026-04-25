1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    boolean flag = true;
18    public void inorder(TreeNode root, TreeNode curr){
19        if (root == null || flag == false)
20        return;
21
22        if (root.val != curr.val){
23            flag = false;
24            return;
25        }
26        
27        inorder(root.left, curr);
28        inorder(root.right, curr);
29    }
30    public boolean isUnivalTree(TreeNode root) {
31        inorder(root, root);
32
33        return flag;
34    }
35}