1class Solution {
2    public int longestBalanced(String s) {
3        Map <Character, Integer> mp = new HashMap<>();
4        int res = 0;
5
6        for (int i = 0; i < s.length(); i++){
7            mp.clear();
8            for (int j = i; j < s.length(); j++){
9                char c = s.charAt(j);
10                mp.put(c, mp.getOrDefault(c, 0)+1);
11
12                int curr_mpcount = mp.get(c);
13                boolean flag = true;
14
15                for (int count : mp.values()){
16                    if (count != curr_mpcount){
17                        flag = false;
18                        break;
19                    }
20                }
21
22                if (flag == true){
23                    res = Math.max(res, j - i + 1);
24                }
25            }
26        }
27        return res;
28    }
29}