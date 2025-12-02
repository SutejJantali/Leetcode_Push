1class Solution:
2    def minimumOperations(self, nums: List[int]) -> int:
3        res = 0
4
5        for i in range(len(nums)):
6            if nums[i] % 3 != 0:
7                res += 1
8            
9        return res