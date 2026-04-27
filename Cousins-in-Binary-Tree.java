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
17    public boolean isCousins(TreeNode root, int x, int y) {
18        Queue <TreeNode> q = new LinkedList<>();
19        q.add(root);
20
21        while(q.isEmpty() == false){
22            int size = q.size();
23            boolean foundX = false, foundY = false;
24            for (int i = 0; i < size; i++){
25                TreeNode node = q.poll();
26
27                if (node.val == x) foundX = true;
28                if (node.val == y) foundY = true;
29
30
31                // Check if siblings (same parent)
32                if (node.left != null && node.right != null) {
33                    if ((node.left.val == x && node.right.val == y) ||
34                        (node.left.val == y && node.right.val == x)) {
35                        return false; // siblings → not cousins
36                    }
37                }
38
39                if (node.left != null) q.offer(node.left);
40                if (node.right != null) q.offer(node.right);
41            }
42            
43            if (foundX && foundY)
44                return true;
45
46            if (foundX || foundY)
47                return false; 
48        }
49
50        return false;
51    }
52}