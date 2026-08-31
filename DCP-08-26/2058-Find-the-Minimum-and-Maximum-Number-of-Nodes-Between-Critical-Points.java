/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head, curr = head.next, nxt = curr.next;

        if (curr == null){
            return new int[]{-1, -1};
        }
        ArrayList <Integer> res = new ArrayList<>();
        int pos = 1;
        while (nxt != null){
            if (curr.val < prev.val && curr.val < nxt.val){
                res.add(pos);
            }
            else if (curr.val > prev.val && curr.val > nxt.val){
                res.add(pos);
            }

            pos += 1;
            prev = curr;
            curr = nxt;
            nxt = nxt.next;
        }
        if (res.size() < 2)
        return new int[]{-1, -1};

        int min_dis = Integer.MAX_VALUE;

        for (int i = 1; i < res.size(); i++){
            min_dis = Math.min(min_dis, res.get(i) - res.get(i-1));
        }
        int max_dis = res.get(res.size() - 1) - res.get(0);

        return new int[]{min_dis, max_dis};
    }
}