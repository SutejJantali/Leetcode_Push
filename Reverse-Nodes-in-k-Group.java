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
12    public ListNode reverse(ListNode start, ListNode end){
13        ListNode prev = null, curr = start;
14        while (curr != end){
15            ListNode nxt = curr.next;
16            curr.next = prev;
17            prev = curr;
18            curr = nxt;
19        }
20
21        return prev;
22    }
23    public ListNode reverseKGroup(ListNode head, int k) {
24        int count = 0;
25        ListNode temp = head;
26
27        while (temp != null && count < k){
28            temp = temp.next;
29            count += 1;
30        }
31
32        if (count < k)
33        return head;
34
35        ListNode newHead = reverse(head, temp);
36        head.next = reverseKGroup(temp, k);
37
38        return newHead;
39    }
40//  EX:   1 → 2 → 3 → 4 → 5
41
42    // k = 2
43
44    // Step 1: First call —
45    // reverseKGroup(1, 2)
46
47    // Count k=2 nodes: temp stops at node 3
48    // Reverse [1 → 2] (up to node 3):
49    //     Result: 2 → 1
50    // head (node 1).next = reverseKGroup(node 3, 2)  ← recursive call
51
52    // Step 2: Recursive call —
53    // reverseKGroup(3, 2)
54
55    // Count k=2 nodes: temp stops at node 5
56    // Reverse [3 → 4] (up to node 5):
57    //     Result: 4 → 3
58    // head (node 3).next = reverseKGroup(node 5, 2)  ← recursive call
59
60    // Step 3: Recursive call —
61    // reverseKGroup(5, 2)
62
63    // Count = 1, which is < k=2
64    // → Return node 5 as-is (no reversal)
65
66    // Step 4: Chain everything together
67    // 2 → 1 → 4 → 3 → 5
68
69    // Output:
70    // 2 → 1 → 4 → 3 → 5
71
72}