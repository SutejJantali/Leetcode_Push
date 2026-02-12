1class Solution {
2    public String simplifyPath(String path) {
3        String[] components = path.split("/"); // splits entire string with '/'
4        Stack <String> st = new Stack<>();
5
6        for (String comp: components){
7            if (comp.equals("") || comp.equals(".")){
8                continue; // ignore empty spaces and '.'
9            }
10
11            if (comp.equals("..")){
12                if (st.empty() == false){
13                    st.pop(); // if encountered '..' it means we can ignore its previous folder in final expression
14                }
15            }
16            else{
17                st.push(comp);
18            }
19        }
20
21        StringBuilder res = new StringBuilder();
22        while(st.empty() == false){
23            res.insert(0, "/"); // first position insert '/'
24            res.insert(1, st.pop()); // second pos insert stack top and pop it
25        }
26
27        return res.length() == 0? "/" : res.toString();
28    }
29}