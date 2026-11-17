class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        counts = Counter(nums)

        for num in nums:
            if counts[num] > 1:
                return True
        
        return False