1class Solution {
2    public String processStr(String s) {
3        StringBuilder res = new StringBuilder();
4
5        for (int i = 0; i < s.length(); i++){
6            if (s.charAt(i) >= 'a' && s.charAt(i) <=  'z'){
7                res.append(s.charAt(i));
8            }
9            else if (s.charAt(i) == '#' && res.length() > 0){
10                int k = res.length();
11                
12                for (int j = 0; j < k; j++)
13                // if (s.charAt(j) == '#')
14                res.append(res.charAt(j));
15            }
16            else if (s.charAt(i) == '*' && res.length() > 0){
17                res = res.deleteCharAt(res.length()-1);
18            }
19            else if (s.charAt(i) == '%' && res.length() > 0){
20                res.reverse();
21            }
22        }
23        
24        return res.toString();
25    }
26}