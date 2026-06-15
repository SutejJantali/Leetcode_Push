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
12    public ListNode deleteMiddle(ListNode head) {
13        if (head.next == null)
14        return null;
15
16        ListNode first = head, second = first.next.next;
17
18        while (second != null && second.next != null){
19            first = first.next;
20            second = second.next.next;
21        }
22
23        first.next = first.next.next;
24
25        return head;
26    }
27}