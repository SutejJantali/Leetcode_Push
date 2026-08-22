class Solution:
    def checkDivisibility(self, n: int) -> bool:
        num = n
        mul, add = 1, 0

        while (num > 0):
            mul = mul * (num % 10)
            add += num % 10
            num //= 10

        return True if n % (add + mul) == 0 else False