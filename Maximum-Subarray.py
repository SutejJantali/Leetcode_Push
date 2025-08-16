class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        res = nums[0]
        sum = 0
        for num in nums:
            if sum < 0:
                sum = 0

            sum += num

            if sum > res:
                res = sum

        return res