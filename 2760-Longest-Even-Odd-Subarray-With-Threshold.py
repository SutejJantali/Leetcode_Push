class Solution:
    def longestAlternatingSubarray(self, nums: List[int], threshold: int) -> int:
        # if len(nums) == 1 and nums[0] % 2 == 0:
        #     return 1
        res = 0
        
        for left in range(len(nums)):
            if nums[left] % 2 == 0 and nums[left] <= threshold:
                curr_left = left
                for right in range(left, len(nums)):
                    if right != left and (nums[right] % 2 == nums[curr_left] % 2 or nums[right] > threshold):
                        break
                    
                    res = max(res, right - left + 1)
                    curr_left = right

        return res