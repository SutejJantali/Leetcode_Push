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
17    HashSet<Integer> set = new HashSet<>();
18    public boolean findTarget(TreeNode root, int k) {
19        if (root == null)
20        return false;
21
22        if (set.contains(k - root.val))
23        return true;
24
25        set.add(root.val);
26
27        return findTarget(root.right, k) || findTarget(root.left, k);
28    }
29}
30/*
31Example Walkthrough
32Target (k) = 9
33Tree Structure:
34text
35    5
36   / \
37  3   6
38Use code with caution.
39Node 5:
40Target complement: 
41
42
43.
44Is 4 in the set? No.
45Action: Add 5 to the set. Set = {5}.
46Node 3 (left):
47Target complement: 
48
49
50.
51Is 6 in the set? No.
52Action: Add 3 to the set. Set = {5, 3}.
53Node 6 (right):
54Target complement: 
55
56
57.
58Is 3 in the set? Yes!
59Action: Return true.*/