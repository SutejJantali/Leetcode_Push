class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        twice_num, miss_num = 0, 0
        freq = [0] * (len(nums)+1)
        for i in range(len(nums)):
            freq[nums[i]] += 1
        
        for i in range(1, len(nums)+1):
            if freq[i] == 2:
                twice_num = i
            elif freq[i] == 0:
                miss_num = i
        
        return [twice_num, miss_num]