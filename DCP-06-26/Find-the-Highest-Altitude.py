1class Solution:
2    def largestAltitude(self, gain: List[int]) -> int:
3        res = 0
4        temp = 0
5        for num in gain:
6            curr = temp + num
7            temp = curr
8            if curr > res:
9                res = curr
10            
11        return res