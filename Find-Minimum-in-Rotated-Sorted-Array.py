class Solution:
    def findMin(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]

        if len(nums) == 2:
            return nums[0] if nums[0] < nums[1] else nums[1]
        
        low, high, res = 0, len(nums) - 1, 5000

        while low <= high:
            mid = low + (high-low)//2
            if nums[low] <= nums[mid]:
                res = min(res, nums[low])
                low = mid + 1
            else:
                res = min(res, nums[mid])
                high = mid - 1

        return res