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
12    public ListNode rotateRight(ListNode head, int k) {
13        if (head == null || k == 0 || head.next == null)
14        return head;
15
16        ListNode first = head, newhead = head, prev = head;
17        int len = 0;
18        while (first != null){
19            first = first.next;
20            len += 1;
21        }
22        k = k % len;
23        if (k == 0)
24        return head;
25
26        first = head;
27        while (len - k > 0){
28            prev = newhead;
29            newhead = newhead.next;
30            k += 1;
31        }
32        prev.next = null;
33        prev = newhead;
34        while(newhead.next != null){
35            newhead = newhead.next;
36        }
37        newhead.next = first;
38
39        return prev;
40    }
41}