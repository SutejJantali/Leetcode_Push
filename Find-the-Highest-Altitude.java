1class Solution {
2    public int largestAltitude(int[] gain) {
3        int[] res_arr = new int[gain.length+1];
4        res_arr[0] = 0;
5        res_arr[1] = gain[0];
6        int res = gain[0];
7        for (int i = 1; i < gain.length; i++){
8            res_arr[i+1] = gain[i] + res_arr[i];
9            res = Math.max(res, res_arr[i+1]);
10        }
11
12        if (res < 0)
13        return 0;
14        
15        return res;
16    }
17}