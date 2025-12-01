1class Solution:
2    def minOperations(self, nums: List[int], k: int) -> int:
3        curr_sum = 0
4        for num in nums:
5            curr_sum += num
6        
7        return curr_sum % k if curr_sum % k != 0 else 0