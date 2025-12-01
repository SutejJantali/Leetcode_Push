1class Solution:
2    def minSubarray(self, nums: List[int], p: int) -> int:
3        total_sum = 0
4        for num in nums:
5            total_sum = (total_sum + num) % p
6        
7        target = total_sum % p
8
9        if target == 0:
10            return 0
11
12        mod_map = {0:-1}
13
14        curr_sum = 0
15        min_len = len(nums)
16        n = len(nums)
17        for i in range(n):
18            curr_sum = (curr_sum + nums[i]) % p
19
20            needed = (curr_sum - target + p) % p
21
22            if needed in mod_map:
23                min_len = min(min_len, i - mod_map[needed])
24            mod_map[curr_sum] = i
25        
26        return -1 if min_len == n else min_len