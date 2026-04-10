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
17    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
18        if (root1 == null)
19        return root2;
20        if (root2 == null)
21        return root1;
22
23        root1.val += root2.val;
24
25        root1.left = mergeTrees(root1.left, root2.left);
26        root1.right = mergeTrees(root1.right, root2.right);
27
28        return root1;
29    }
30}