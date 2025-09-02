class Solution:
    def countSymmetricIntegers(self, low: int, high: int) -> int:
        res = 0

        for i in range(low, high+1):
            if i < 100 and i % 11 == 0:
                res += 1
            elif i >= 1000 and i < 10000:
                left = i // 1000 + (i % 1000)//100
                right = (i % 100)//10 + (i%10)

                if left == right:
                    res += 1
        
        return res