1class Solution {
2    public int numDecodings(String s) {
3        int[] dp = new int[s.length()+1];
4        Arrays.fill(dp, -1);
5        
6        return s.length() == 0 ? 0 : f(0, dp, s);
7    }
8
9    public int f(int ind, int[] dp, String s){
10        if (ind == s.length())
11        return 1;
12
13        if (s.charAt(ind) == '0')
14        return 0;
15
16        if (dp[ind] != -1)
17        return dp[ind];
18
19        int res = f(ind+1, dp, s);
20        if (ind+1 < s.length() && (s.charAt(ind) == '1' || (s.charAt(ind) == '2' && s.charAt(ind+1) < '7'))){
21            res += f(ind+2, dp, s);
22        }
23
24        return dp[ind] = res;
25    }
26}