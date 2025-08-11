class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        if n == 0:
            return True
        
        for i in range(len(flowerbed)):
            if i == len(flowerbed)-1 and flowerbed[i-1] == 0 and flowerbed[i] == 0:
                n -= 1
                flowerbed[i] = 1
            elif i > 0 and i != len(flowerbed)-1:
                if flowerbed[i] == 0 and flowerbed[i+1] == 0 and flowerbed[i-1] == 0:
                    n -= 1
                    flowerbed[i] = 1
            elif i != len(flowerbed)-1:
                if flowerbed[i] == 0 and flowerbed[i+1] == 0:
                    n -= 1
                    flowerbed[i] = 1
                
        
        return True if n <= 0 else False