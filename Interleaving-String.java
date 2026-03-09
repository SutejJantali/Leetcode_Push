1class Solution {
2    public boolean checkinterleave(String s1, String s2, String s3, Boolean[][] dp,int i,int j,int k){
3        if (i < 0 && j < 0 && k < 0)
4        return true;
5
6        if (k < 0)
7        return false;
8
9        if (dp[i+1][j+1] != null)
10        return dp[i+1][j+1];
11
12        boolean flag = false;
13        if (i > -1 && s1.charAt(i) == s3.charAt(k)){
14            flag = flag || checkinterleave(s1, s2, s3, dp, i-1, j, k-1);
15        }
16        if (j > -1 && s2.charAt(j) == s3.charAt(k)){
17            flag = flag || checkinterleave(s1, s2, s3, dp, i, j-1, k-1);
18        }
19
20        dp[i+1][j+1] = flag;
21        return flag;
22    }
23    public boolean isInterleave(String s1, String s2, String s3) {
24        Boolean[][] dp = new Boolean[s1.length()+1][s2.length()+1];
25
26        return checkinterleave(s1, s2, s3, dp, s1.length()-1, s2.length()-1, s3.length()-1);
27    }
28}