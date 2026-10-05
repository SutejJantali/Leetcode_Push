class Solution {
    public int scoreOfParentheses(String s) {
        Stack <Integer> st = new Stack<>();

        st.push(0);

        for (char ch : s.toCharArray()){
            if (ch == '('){
                st.push(0);
            }
            else{
                int current = st.pop();
                st.push(st.pop() + Math.max(1, 2 * current));
            }
        }

        return st.peek();
    }
}