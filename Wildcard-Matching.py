1class Solution:
2    def isMatch(self, s: str, p: str) -> bool:
3        dp = [[-1 for _ in range(len(p))] for _ in range(len(s))]
4
5        def f(index1, index2, s, p, dp):
6            if index1 < 0 and index2 < 0:
7                return True
8            
9            if index1 < 0 and index2 >= 0:
10                for i in range(index2+1):
11                    if p[i] != '*':
12                        return False
13                return True
14            
15            if index1 >= 0 and index2 < 0:
16                return False
17
18            
19            if dp[index1][index2] != -1:
20                return dp[index1][index2] == 1
21            
22            if s[index1] == p[index2] or p[index2] == '?':
23                dp[index1][index2] = f(index1-1, index2 - 1, s, p, dp)
24            elif p[index2] == '*':
25                dp[index1][index2] = f(index1-1, index2, s, p, dp) or f(index1, index2 - 1, s, p, dp)
26            else:
27                dp[index1][index2] = 0
28            
29            return dp[index1][index2] == 1
30        
31        return f(len(s)-1, len(p)-1, s, p, dp)