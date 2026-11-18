class Solution:
    def subsets(self, nums: list[int]) -> list[list[int]]:
        res, temp = [], []

        def subset(index, temp, res, nums):
            res.append(list(temp))

            for i in range(index, len(nums)):
                temp.append(nums[i])
                subset(i+1, temp, res, nums)
                temp.pop()
            

        subset(0, temp, res, nums)
        return res