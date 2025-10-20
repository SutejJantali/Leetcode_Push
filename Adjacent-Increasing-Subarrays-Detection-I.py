from typing import List

class Solution:
    def hasIncreasingSubarrays(self, nums: List[int], k: int) -> bool:
        count, precount, res = 1, 0, 0

        for i in range(1, len(nums)):
            if nums[i] > nums[i-1]:
                count += 1
            else:
                precount , count = count, 1
            res = max(res, min(precount, count))
            res = max(res, count // 2)
        
        return res >= k