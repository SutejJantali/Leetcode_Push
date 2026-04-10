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
17    public int res = 0;
18    public int f(TreeNode root){
19        if (root == null)
20        return 0;
21
22        int left = f(root.left);
23        int right = f(root.right);
24        res += Math.abs(left - right);
25
26        return left + right + root.val;
27    }
28    public int findTilt(TreeNode root) {
29        f(root);
30        return res;
31    }
32}