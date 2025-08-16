class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        preprod = postprod = 1
        res = nums[0]

        for i in range(len(nums)):
            preprod *= nums[i]
            postprod *= nums[len(nums)-i-1]

            res = max(res, preprod, postprod)
            if preprod == 0:
                preprod = 1
            if postprod == 0:
                postprod = 1
        
        return res