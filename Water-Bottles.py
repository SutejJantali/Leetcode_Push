class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:
        consumedBottles = 0

        while numBottles - numExchange >= 0:
            consumedBottles += numExchange
            numBottles -= numExchange

            numBottles +=1 
        
        return consumedBottles + numBottles