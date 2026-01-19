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
17    public TreeNode sortedArrayToBST(int[] nums) {
18        return findmidnode(nums, 0, nums.length-1);
19    }
20
21    public TreeNode findmidnode(int[] nums, int left, int right){
22        if (left > right){
23            return null;
24        }
25        int mid = left + (right-left)/2;
26        TreeNode node = new TreeNode(nums[mid]);
27
28        node.left = findmidnode(nums, left, mid-1);
29        node.right = findmidnode(nums, mid+1, right);
30
31        return node;
32    }
33}