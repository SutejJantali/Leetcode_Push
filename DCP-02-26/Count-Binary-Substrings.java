1class Solution:
2    def countBinarySubstrings(self, s: str) -> int:
3        groups = [1]
4
5        for i in range(1, len(s)):
6            if s[i-1] != s[i]:
7                groups.append(1)
8            else:
9                groups[-1] += 1
10        
11        res = 0
12
13        for i in range(1, len(groups)):
14            res += min(groups[i-1], groups[i])
15        
16        return res