1class Solution:
2    def maxDistance(self, colors: List[int]) -> int:
3        res = 0
4        for i in range(len(colors)-1):
5            for j in range(i + 1, len(colors)):
6                if colors[i] != colors[j]:
7                    res = max(res, j - i)
8        
9        return res