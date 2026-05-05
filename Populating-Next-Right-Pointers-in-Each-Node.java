1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node left;
6    public Node right;
7    public Node next;
8
9    public Node() {}
10    
11    public Node(int _val) {
12        val = _val;
13    }
14
15    public Node(int _val, Node _left, Node _right, Node _next) {
16        val = _val;
17        left = _left;
18        right = _right;
19        next = _next;
20    }
21};
22*/
23
24class Solution {
25    public Node connect(Node root) {
26        if (root == null)
27        return root;
28
29        Queue <Node> q = new LinkedList<>();
30        q.add(root);
31
32        while(q.isEmpty() == false){
33            int size = q.size();
34
35            while (size-- > 0){
36                Node curr = q.poll();
37                if (size != 0) 
38                curr.next = q.peek();
39
40                if (curr.left != null)
41                q.add(curr.left);
42
43                if (curr.right != null)
44                q.add(curr.right);
45            }
46        }
47
48        return root;
49    }
50}