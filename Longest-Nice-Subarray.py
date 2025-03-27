class Solution:
    def longestNiceSubarray(self, nums: List[int]) -> int:
        res = 0
        left = 0
        curr_bit = 0
        for right in range(len(nums)):
            while curr_bit & nums[right] != 0:
                curr_bit ^= nums[left]
                left += 1

            curr_bit |= nums[right]

            res = max(res, right - left + 1)
        
        return res
