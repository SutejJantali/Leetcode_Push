1class Solution:
2    def minElement(self, nums: List[int]) -> int:
3        res = float('inf')
4
5        for num in nums:
6            temp_sum = 0
7            while num > 0:
8                temp_sum += num % 10
9                num //= 10
10            
11            res = min(res, temp_sum)
12        
13        return int(res)