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
12    public ListNode mergeKLists(ListNode[] lists) {
13        PriorityQueue <ListNode> pq = new PriorityQueue <> ((a, b) -> a.val - b.val);
14
15        for (ListNode node : lists){
16            if (node != null){
17                pq.add(node); // adds head node val of all lists
18            }
19        }
20
21        ListNode dummy = new ListNode();
22        ListNode res = dummy;
23
24        while (pq.isEmpty() == false){
25            ListNode curr = pq.poll();
26            res.next = curr;
27            res = res.next;
28
29            //for rest of nodes of the list add it back to heap
30            if (curr.next != null){
31                pq.offer(curr.next);
32            }
33        }
34
35        return dummy.next;
36    }
37}