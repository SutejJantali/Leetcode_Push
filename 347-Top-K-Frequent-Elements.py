class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        freq = {}

        for i in range(len(nums)):
            freq[nums[i]] = freq.get(nums[i], 0) + 1

        heap = []

        for key, val in freq.items():
            heapq.heappush(heap, (-val, key))
        
        res = []
        while k > 0:
            res.append(heapq.heappop(heap)[1])
            k -= 1
        
        return res