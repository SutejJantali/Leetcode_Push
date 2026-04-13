1class Solution:
2    def minimumTotal(self, triangle: List[List[int]]) -> int:
3        n = len(triangle)
4
5        res = float('inf')
6        dp = [[-1 for _ in range(n)] for _ in range(n)]
7
8        def f(i, j):
9                    if dp[i][j] != -1:
10                        return dp[i][j]
11                    
12                    if i == 0:
13                        dp[0][0] = triangle[0][0]
14                    elif j == 0:
15                        dp[i][j] = triangle[i][j] + f(i-1, j)
16                    elif i == j:
17                        dp[i][j] = triangle[i][j] + f(i-1, j-1)
18                    else:
19                        dp[i][j] = triangle[i][j] + min(f(i-1, j), f(i-1, j-1))
20                    return dp[i][j] 
21
22        for j in range(n):
23            res = min(res, f(n-1, j))
24
25        return res
26
27        
28            
29
30            