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
17    public void flatten(TreeNode root) {
18        if (root == null)
19        return;
20
21        ArrayList <TreeNode> transform = new ArrayList<>();
22        Preorder(root, transform);
23
24        for (int i = 0; i < transform.size()-1; i++){
25            transform.get(i).left = null;
26            transform.get(i).right = transform.get(i+1);
27        }
28    }
29
30    public void Preorder(TreeNode root, ArrayList<TreeNode> transform){
31        if (root == null)
32        return;
33
34        transform.add(root);
35    
36    /*When you do:
37    nodes.add(node);
38    You are not copying the node ❌
39    You are storing a reference to the same node in memory ✅*/
40
41        Preorder(root.left, transform);
42        Preorder(root.right, transform);
43    }
44}