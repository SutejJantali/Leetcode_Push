1class Solution {
2    public int beautySum(String s) {
3        int res = 0;
4
5        for (int i = 0; i < s.length(); i++){
6            int freq[] = new int[26];
7
8            for (int j = i; j < s.length(); j++){
9                freq[s.charAt(j) - 'a'] += 1;
10
11                int max_val = Integer.MIN_VALUE;
12                int min_val = Integer.MAX_VALUE;
13
14                for (int k = 0; k < 26; k++){
15                    if (freq[k] > 0){
16                        max_val = Math.max(max_val, freq[k]);
17                        min_val = Math.min(min_val, freq[k]);
18                    }
19                }
20
21                res += Math.abs(max_val - min_val);
22            }
23        }
24
25        return res;
26        
27    }
28}