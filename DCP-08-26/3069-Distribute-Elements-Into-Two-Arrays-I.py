class Solution:
    def resultArray(self, nums: List[int]) -> List[int]:
        res = [nums[0], nums[1]]
        split = 0

        for i in range(2, len(nums)):
            arr1_lastele = res[split]

            arr2_lastele = res[-1]

            if arr1_lastele > arr2_lastele:
                res.insert(split + 1, nums[i])
                split += 1
            else:
                res.append(nums[i])

        return res