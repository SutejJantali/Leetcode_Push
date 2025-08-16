class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [0 for i in range(len(nums))]

        left = 1
        for i in range(len(nums)):
            res[i] = left
            left *= nums[i]
        print(res)
        right = 1
        for i in range(len(nums)-1, -1, -1):
            res[i] *= right
            right *= nums[i]
        
        print(res)
        return res