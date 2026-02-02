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
17    int res = 0;
18    public int diameterOfBinaryTree(TreeNode root) {
19        dfs(root);
20        return res;
21    }
22
23    public int dfs(TreeNode root){
24        if (root == null){
25            return 0;
26        }
27
28        int l = dfs(root.left);
29        int r = dfs(root.right);
30
31        res = Math.max(res, l + r);
32
33        return 1 + Math.max(l, r);
34    }
35}