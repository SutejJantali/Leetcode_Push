1class Solution:
2    def findMiddleIndex(self, nums: List[int]) -> int:
3        pre_sum = 0
4        for i in range(len(nums)):
5            pre_sum += nums[i]
6
7        curr_sum = 0
8        for i in range(len(nums)):
9            if (pre_sum - nums[i]) == curr_sum:
10                return i
11            
12            curr_sum += nums[i]
13            pre_sum -= nums[i]
14
15        return -1