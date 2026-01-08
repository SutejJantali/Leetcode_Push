1class Solution:
2    def repeatedNTimes(self, nums: List[int]) -> int:
3        nums = sorted(nums)
4        left, count = 0, 0
5
6        for right in range(len(nums)):
7            if nums[left] == nums[right]:
8                count += 1
9                if count == len(nums)//2:
10                    return nums[left]
11            else:
12                count = 1
13                left = right
14        
15        return 0