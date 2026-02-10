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
17        public void inorder (TreeNode root, List <Integer> val){
18            if (root == null)
19            return;
20
21            inorder(root.left, val);
22            val.add(root.val);
23            inorder(root.right, val);
24        }
25
26        public TreeNode build(List <Integer> val, int l, int r){
27            if (l > r)
28            return null;
29
30            int mid = (l+r)/2;
31            TreeNode root = new TreeNode(val.get(mid));
32        root.left = build(val, l, mid-1);
33        root.right = build(val, mid+1, r);
34
35        return root;
36        }
37    public TreeNode balanceBST(TreeNode root) {
38        List <Integer> val = new ArrayList<>();
39        inorder(root, val);
40        return build(val, 0, val.size()-1);
41    }
42}