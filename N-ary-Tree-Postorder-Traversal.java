1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> children;
6
7    public Node() {}
8
9    public Node(int _val) {
10        val = _val;
11    }
12
13    public Node(int _val, List<Node> _children) {
14        val = _val;
15        children = _children;
16    }
17}
18*/
19
20class Solution {
21    public void Getpostorder(List <Integer> res, Node root){
22        if (root == null)
23        return;
24        
25        for (Node child : root.children){
26            Getpostorder(res, child);
27        }
28
29        res.add(root.val);
30    }
31    public List<Integer> postorder(Node root) {
32        List <Integer> res = new ArrayList<>();
33        Getpostorder(res, root);
34
35        return res;
36    }
37}