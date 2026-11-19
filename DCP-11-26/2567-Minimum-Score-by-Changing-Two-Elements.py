class Solution:
    def minimizeSum(self, nums: List[int]) -> int:
        if len(nums) <= 3:
            return 0

        nums.sort()

        max1, max2, max3 = nums[-1], nums[-2], nums[-3]
        min1, min2, min3 = nums[0], nums[1], nums[2]

        return min(
            max3 - min1, #change two largest ele
            max2 - min2, #change largest and smallest ele
            max1 - min3  #change two smallest ele
        )
