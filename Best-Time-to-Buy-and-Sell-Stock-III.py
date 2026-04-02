1class Solution:
2    def maxProfit(self, prices: List[int]) -> int:
3        transaction1, transaction2 = float('inf'), float('inf')
4        profit1, profit2 = 0, 0
5
6        for price in prices:
7            transaction1 = min(transaction1, price)
8            profit1 = max(profit1, price - transaction1)
9
10            transaction2 = min(transaction2, price-profit1)
11            profit2 = max(profit2, price - transaction2)
12        return profit2