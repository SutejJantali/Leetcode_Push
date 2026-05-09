1class Solution:
2    def isMatch(self, s: str, p: str) -> bool:
3        m = len(s)
4        n = len(p)
5
6        dp = [[False]*(n+1) for _ in range(m+1)]
7
8        dp[0][0] = True
9
10        for j in range(1, n+1):
11            if p[j-1] == '*':
12                dp[0][j] = dp[0][j-2]
13
14        for i in range(1, m+1):
15            for j in range(1, n+1):
16                if p[j-1] == '.' or p[j-1] == s[i-1]:
17                    dp[i][j] = dp[i-1][j-1]
18                elif p[j-1] == '*':
19                    dp[i][j] = dp[i][j-2]
20                    if p[j-2] == '.' or p[j-2] == s[i-1]:
21                        dp[i][j] = dp[i][j] or dp[i-1][j]
22        
23        return dp[m][n]