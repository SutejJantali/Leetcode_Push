1class Solution:
2    def largeGroupPositions(self, s: str) -> List[List[int]]:
3        res = []
4        start, end = 0, 0
5
6        for end in range(1, len(s)):
7            if s[end] != s[end-1]:
8                if end - start > 2:
9                    res.append([start, end-1])
10                start = end
11        if s[start] == s[end] and len(s) - start > 2:
12            res.append([start, len(s)-1])
13            
14        return res