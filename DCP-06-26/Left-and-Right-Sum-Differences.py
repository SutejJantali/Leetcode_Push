1class Solution:
2    def leftRightDifference(self, nums: List[int]) -> List[int]:
3        res = []
4        left_sum, right_sum = 0, sum(nums)
5        for i in range(len(nums)):
6            right_sum -= nums[i]
7            res.append(abs(left_sum - right_sum))
8            left_sum += nums[i]
9
10        return res