1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11/**
12 * Definition for a binary tree node.
13 * public class TreeNode {
14 *     int val;
15 *     TreeNode left;
16 *     TreeNode right;
17 *     TreeNode() {}
18 *     TreeNode(int val) { this.val = val; }
19 *     TreeNode(int val, TreeNode left, TreeNode right) {
20 *         this.val = val;
21 *         this.left = left;
22 *         this.right = right;
23 *     }
24 * }
25 */
26class Solution {
27    public TreeNode sortedListToBST(ListNode head) {
28        if (head == null)
29        return null;
30
31        if (head.next == null) 
32        return new TreeNode(head.val);
33
34        ListNode slow = head, fast = head, slow_prev = null;
35        while(fast != null && fast.next != null){
36            slow_prev = slow;
37            slow = slow.next;
38            fast = fast.next.next;
39        }
40
41        TreeNode root = new TreeNode(slow.val);
42        slow_prev.next = null;
43        root.left = sortedListToBST(head);
44        root.right = sortedListToBST(slow.next);
45        return root;
46    }
47}