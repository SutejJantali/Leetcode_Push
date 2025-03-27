class Solution:
    def minOperations(self, nums: List[int]) -> int:
        count_op = 0

        for right in range(2, len(nums)):
            if nums[right-2] == 0:
                nums[right-2] ^= 1
                nums[right-1] ^= 1
                nums[right] ^= 1
                count_op += 1
        
        for num in nums:
            if num == 0:
                return -1

        return count_op