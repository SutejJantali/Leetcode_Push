class Solution:
    def search(self, nums: List[int], target: int) -> int:
        if len(nums) == 1:
            return 0 if target == nums[0] else -1
        
        if len(nums) == 2:
            if nums[0] == target:
                return 0
            elif nums[1] == target:
                return 1
        
        low, high = 0, len(nums)-1

        while low <= high:
            mid = low + (high-low)//2

            if nums[mid] == target:
                return mid
            elif nums[low] <= nums[mid]: #Check if number exists in first sorted arr
                if nums[low] <= target < nums[mid]:
                    high = mid - 1
                else:
                    low = mid + 1
            elif nums[mid] <= nums[high]:#Check if number exists in second sorted arr
                if nums[mid] < target <= nums[high]:
                    low = mid + 1
                else:
                    high = mid - 1

        return -1