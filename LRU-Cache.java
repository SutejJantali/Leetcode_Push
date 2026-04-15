1class Node{
2    int key, val;
3    Node prev, next;
4    Node(int key, int val){
5        this.key = key;
6        this.val = val;
7    }
8}
9
10class LRUCache {    
11    private final int capacity;
12    private final Map<Integer, Node> mp;
13    private final Node head, tail;
14
15    public LRUCache(int capacity) {
16        this.capacity = capacity;
17        this.mp = new HashMap<>();
18        head = new Node(0, 0);
19        tail = new Node(0, 0);
20        head.next = tail;
21        tail.prev = head; 
22    }
23    
24    public int get(int key) {
25        if (!mp.containsKey(key)) return -1;
26        Node node = mp.get(key);
27        remove(node);
28        insertAtFront(node);
29        return node.val;
30    }
31    
32    public void put(int key, int val) {
33        if (mp.containsKey(key)){
34            Node node = mp.get(key);
35            node.val = val;
36            remove(node);
37            insertAtFront(node);
38        }
39        else{
40            if (mp.size() == capacity) {
41                Node lru = tail.prev;
42                remove(lru);
43                mp.remove(lru.key);
44            }
45            Node newNode = new Node(key, val);
46            insertAtFront(newNode);
47            mp.put(key, newNode);
48        }
49    }
50
51    private void remove(Node node){
52        node.prev.next = node.next;
53        node.next.prev = node.prev;
54    }
55
56    private void insertAtFront(Node node){
57        node.next = head.next;
58        node.prev = head;
59        head.next.prev = node;
60        head.next = node;
61    }
62}
63
64/**
65 * Your LRUCache object will be instantiated and called as such:
66 * LRUCache obj = new LRUCache(capacity);
67 * int param_1 = obj.get(key);
68 * obj.put(key,value);
69 */