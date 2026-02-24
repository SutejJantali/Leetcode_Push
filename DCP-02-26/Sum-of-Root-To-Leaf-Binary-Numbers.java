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
17    public int sumRootToLeaf(TreeNode root) {
18        return sumoflastnodes(root, 0);
19    }
20
21    public int sumoflastnodes(TreeNode root, int lastsum){
22        if (root == null){
23            return 0;
24        }
25
26        lastsum = lastsum * 2 + root.val;
27
28        if (root.left == null && root.right == null){
29            return lastsum;
30        }
31
32        return sumoflastnodes(root.left, lastsum) + sumoflastnodes(root.right, lastsum);
33    }
34}