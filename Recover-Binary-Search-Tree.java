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
17    void inorder(TreeNode root, ArrayList <TreeNode> list){
18        if (root == null){
19            return;
20        }
21        inorder(root.left, list);
22        list.add(root);
23        inorder(root.right, list);
24    }
25    public void recoverTree(TreeNode root) {
26        ArrayList <TreeNode> list = new ArrayList<>();
27        inorder(root, list);
28        TreeNode first = null, second = null;
29        for (int i = 0; i < list.size()-1; i++){
30            if (list.get(i).val > list.get(i+1).val){
31                if (first == null)
32                first = list.get(i);
33
34                second = list.get(i+1);
35            }
36        }
37        first.val = first.val ^ second.val;
38        second.val = first.val ^ second.val;
39        first.val = first.val ^ second.val;
40    }
41}