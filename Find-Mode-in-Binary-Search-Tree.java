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
17    private int curr_val, curr_count = 0, max_count = 0;
18    private List <Integer> modes = new ArrayList<>();
19    public int[] findMode(TreeNode root) {
20        inorder(root);
21        int []res = new int[modes.size()];
22
23        for (int i = 0; i < modes.size(); i++){
24            res[i] = modes.get(i);
25        }
26
27        return res;
28    }
29    private void inorder(TreeNode root){
30        if (root == null)
31        return;
32
33        inorder(root.left);
34
35        curr_count = (curr_val == root.val) ? curr_count + 1 : 1;
36        if (curr_count == max_count){
37            modes.add(root.val);
38        }
39        else if (curr_count > max_count){
40            max_count = curr_count;
41            modes.clear();
42            modes.add(root.val);
43        }
44        curr_val = root.val;
45
46        inorder(root.right);
47    }
48}