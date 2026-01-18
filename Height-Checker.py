1class Solution:
2    def heightChecker(self, heights: List[int]) -> int:
3        expected = sorted(heights)
4        res = 0
5        for i in range(len(heights)):
6            if heights[i] != expected[i]:
7                res += 1
8        
9        return res