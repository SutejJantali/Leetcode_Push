class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minprice = float('inf')
        maxprice = 0

        for i in range(len(prices)):
            minprice = min(prices[i], minprice)
            maxprice = max(prices[i]-minprice, maxprice)
        
        return maxprice