1class Solution:
2    def countPartitions(self, nums: List[int]) -> int:
3        res = 0
4        curr_sum = 0
5        tot_sum = 0
6        for num in nums:
7            tot_sum += num
8
9        for i in range(len(nums)-1):
10            curr_sum += nums[i] #10
11            tmp_diff = tot_sum - curr_sum #26
12            rem_diff = tot_sum - tmp_diff #10
13            if abs(tmp_diff - rem_diff) % 2 == 0:
14                res += 1
15        
16        return res