1class Solution {
2    public boolean isValid(String s) {
3        Stack <Character> st = new Stack<>();
4
5        for (int i = 0; i < s.length(); i++){
6            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
7                st.push(s.charAt(i));
8            }
9            else if (st.isEmpty() == false){
10                if (s.charAt(i) == ')' && st.pop() != '('){
11                    return false;
12                }
13                else if (s.charAt(i) == ']' && st.pop() != '['){
14                    return false;
15                }
16                else if (s.charAt(i) == '}' && st.pop() != '{'){
17                    return false;
18                }
19            }
20            else{
21                return false;
22            }
23        }
24        if (st.isEmpty() == false){
25            return false;
26        }
27        return true;
28    }
29}