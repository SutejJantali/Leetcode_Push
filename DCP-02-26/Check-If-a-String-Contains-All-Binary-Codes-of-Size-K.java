1class Solution {
2    public boolean hasAllCodes(String s, int k) {
3        Set <String> res = new HashSet<>();
4        int target = 1 << k;
5
6        for (int i = 0; i < s.length() - k + 1; i++){
7            String sub = s.substring(i, i+k);
8            res.add(sub);
9
10            if (res.size() == target)
11            return true;
12        }
13
14        return res.size() == target;
15    }
16}