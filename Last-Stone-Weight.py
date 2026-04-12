1class Solution:
2    def lastStoneWeight(self, stones: List[int]) -> int:
3        stones = [-i for i in stones]
4        heapq.heapify(stones)
5        while len(stones) > 1:
6            first = abs(heapq.heappop(stones))
7            second = abs(heapq.heappop(stones))
8            if first != second:
9                heapq.heappush(stones, -abs(first - second))
10
11        return abs(stones[0]) if len(stones) else 0