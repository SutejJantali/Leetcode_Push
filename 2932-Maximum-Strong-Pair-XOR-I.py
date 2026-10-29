class Solution:
    def maximumStrongPairXor(self, nums: List[int]) -> int:
        res = 0

        for i in nums:
            for j in nums:
                if abs(i-j) <= min(i, j):
                    res = max(res, i ^ j)

        return res