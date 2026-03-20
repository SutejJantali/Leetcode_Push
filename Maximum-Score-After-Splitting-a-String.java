1class Solution {
2    public int maxScore(String s) {
3        int res = 0;
4
5        for (int i = 0; i < s.length()-1; i++){
6            int curr = 0;
7            for (int j = 0; j <= i; j++){
8                if (s.charAt(j) == '0')
9                curr += 1;
10            }
11
12            for (int j = i+1; j < s.length(); j++){
13                if (s.charAt(j) == '1')
14                curr += 1;
15            }
16
17            res = Math.max(res, curr);
18        }
19
20        return res;
21    }
22}