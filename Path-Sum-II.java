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
17    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
18        List <List<Integer>> res= new ArrayList<>();
19        List<Integer> curr = new ArrayList<>();
20
21        dfs(root, targetSum, 0, res, curr);
22        return res;
23    }
24
25    void dfs(TreeNode root, int target, int sum, List<List<Integer>> res, List<Integer> curr){
26        if (root == null)
27        return;
28
29        sum += root.val;
30        curr.add(root.val);
31
32        if (root.left == null && root.right == null && target == sum){
33            res.add(new ArrayList<>(curr));
34        }
35
36        dfs(root.left, target, sum, res, curr);
37        dfs(root.right, target, sum, res, curr);
38        
39        curr.remove(curr.size()-1);
40    }
41}