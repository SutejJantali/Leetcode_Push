1class MinStack {
2    Stack <int[]> st;
3    public MinStack() {
4        st = new Stack<>();
5    }
6    
7    public void push(int val) {
8        int mini = val;
9        if (st.isEmpty() == false){
10            mini = Math.min(mini, st.peek()[1]);
11        }
12        st.push(new int[] {val, mini});
13    }
14    
15    public void pop() {
16        st.pop();
17    }
18    
19    public int top() {
20        return st.peek()[0];
21    }
22    
23    public int getMin() {
24        return st.peek()[1];
25    }
26}
27
28/**
29 * Your MinStack object will be instantiated and called as such:
30 * MinStack obj = new MinStack();
31 * obj.push(val);
32 * obj.pop();
33 * int param_3 = obj.top();
34 * int param_4 = obj.getMin();
35 */