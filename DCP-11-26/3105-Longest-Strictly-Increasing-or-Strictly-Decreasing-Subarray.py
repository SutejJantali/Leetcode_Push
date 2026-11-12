class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0

        res_dec = 1
        left = 0

        for right in range(1, len(nums)):
            if nums[right] > nums[right-1]:
                res_dec = max(res_dec, right - left + 1)
            else:
                left = right

        left = 0
        res_inc = 1
        for right in range(1, len(nums)):
            if nums[right] < nums[right-1]:
                res_inc = max(res_inc, right - left + 1)
            else:
                left = right

        return max(res_inc, res_dec)