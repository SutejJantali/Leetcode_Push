1class Solution {
2    public int largestAltitude(int[] gain) {
3        int res = gain[0];
4        int curr = gain[0];
5        for (int i = 1; i < gain.length; i++){
6            int nxt = curr + gain[i];
7            res = Math.max(res, nxt);
8            curr = nxt;
9        }
10
11        if (res < 0)
12        return 0;
13
14        return res;
15    }
16}