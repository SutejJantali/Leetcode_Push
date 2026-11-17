class Solution:
    def mostFrequentEven(self, nums: list[int]) -> int:
        freq = {}

        for i in range(len(nums)):
            freq[nums[i]] = freq.get(nums[i], 0) + 1
        
        heap = []
        for key, val in freq.items():
            heapq.heappush(heap, (-val, key))
        
        max_freq, res = -1, -1

        while heap:
            curr_freq, curr_ele = heapq.heappop(heap)

            if curr_ele % 2 == 0 and abs(curr_freq) > max_freq:
                max_freq = abs(curr_freq)
                res = curr_ele
        
        return res