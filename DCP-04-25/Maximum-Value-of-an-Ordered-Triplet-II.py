class Solution:
    def maximumTripletValue(self, nums: List[int]) -> int:
        res = 0
        n = len(nums)
        leftmax = [0 for i in range(n)]
        rightmax = [0 for i in range(n)]
        
        for i in range(1, n):
            leftmax[i] = max(leftmax[i-1], nums[i-1])
            rightmax[n-i-1] = max(rightmax[n-i], nums[n-i])
        
        for j in range(1, n):
            res = max(res, (leftmax[j]-nums[j])*rightmax[j])

        return res