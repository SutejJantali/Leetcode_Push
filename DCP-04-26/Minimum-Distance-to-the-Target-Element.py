1class Solution:
2    def getMinDistance(self, nums: List[int], target: int, start: int) -> int:
3        res = float('inf')
4        for i in range(len(nums)):
5            if nums[i] == target:
6                res = min(res, abs(i-start))
7        
8        return res