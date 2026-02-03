1class Solution {
2    public String removeDuplicates(String s) {
3        StringBuilder res = new StringBuilder();
4
5        for (int i = 0; i < s.length(); i++){
6            int len = res.length();
7
8            if (len > 0 && res.charAt(len-1) == s.charAt(i)){
9                res.deleteCharAt(len-1);
10            }
11            else{
12                res.append(s.charAt(i));
13            }
14        }
15
16        return new String(res);
17    }
18}
19