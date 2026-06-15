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
11class Solution {
12    public int pairSum(ListNode head) {
13        int first_node = head.val;
14        if (head.next.next == null)
15        return head.val + head.next.val;
16
17        ListNode first = head, second = head;
18        while (second != null && second.next != null){
19            first = first.next;
20            second = second.next.next;
21        }
22
23        ListNode prev = null;
24        while (first != null){
25            ListNode nxt = first.next;
26            first.next = prev;
27            prev = first;
28            first = nxt;
29        }
30        first = head;
31        second = prev;
32        int res = 0;
33
34        while (second != null){
35            res = Math.max(res, first.val + second.val);
36            first = first.next;
37            second = second.next;
38        }
39
40        return res;
41    }
42}