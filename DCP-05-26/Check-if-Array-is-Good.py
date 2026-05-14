1class Solution:
2    def isGood(self, nums: List[int]) -> bool:
3        nums = sorted(nums)
4        for i in range(len(nums)-1):
5            if nums[i] != i + 1:
6                return False
7        
8        return nums[len(nums)-1] == len(nums)-1