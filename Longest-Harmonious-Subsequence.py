class Solution:
    def findLHS(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        nums = sorted(nums)
        res = 0
        left = 0

        for right in range(len(nums)):
            while nums[right] - nums[left] > 1:
                left += 1
            
            if nums[right] - nums[left] == 1:
                res = max(res, right - left + 1)
        
        return res