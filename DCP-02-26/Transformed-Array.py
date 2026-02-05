1class Solution:
2    def constructTransformedArray(self, nums: List[int]) -> List[int]:
3        n = len(nums)
4        return [nums[((i + nums[i]) % n + n) % n] for i in range(n)]