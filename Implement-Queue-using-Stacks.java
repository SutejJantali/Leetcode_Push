1class MyQueue {
2    private Stack<Integer> input;
3    private Stack<Integer> output;
4
5    public MyQueue() {
6        input = new Stack<>();
7        output = new Stack<>();
8    }
9
10    public void push(int x) {
11        input.push(x);
12    }
13
14    public int pop() {
15        peek();
16        return output.pop();
17    }
18
19    public int peek() {
20        if (output.isEmpty()) {
21            while (!input.isEmpty()) {
22                output.push(input.pop());
23            }
24        }
25        return output.peek();
26    }
27
28    public boolean empty() {
29        return input.isEmpty() && output.isEmpty();
30    }
31}
32
33/**
34 * Your MyQueue object will be instantiated and called as such:
35 * MyQueue obj = new MyQueue();
36 * obj.push(x);
37 * int param_2 = obj.pop();
38 * int param_3 = obj.peek();
39 * boolean param_4 = obj.empty();
40 */