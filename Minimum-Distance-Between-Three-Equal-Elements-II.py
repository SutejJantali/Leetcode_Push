1class Solution:
2    def minimumDistance(self, nums: List[int]) -> int:
3        nxt = [-1] * len(nums)
4        occur = {}
5        res = len(nums) + 1
6
7        for i in range(len(nums) - 1, -1, -1):
8            if nums[i] in occur:
9                nxt[i] = occur[nums[i]]
10            
11            occur[nums[i]] = i
12        
13        for i in range(len(nums)):
14            second_pos = nxt[i]
15            if second_pos != -1:
16                third_pos = nxt[second_pos]
17                if third_pos != -1:
18                    res = min(res, third_pos - i)
19
20        return -1 if res == len(nums) + 1 else res * 2