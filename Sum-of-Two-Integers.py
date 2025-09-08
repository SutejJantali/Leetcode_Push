class Solution:
    def getSum(self, a: int, b: int) -> int:
        mask = 0xFFFFFFFF
        max_int = 2**31 - 1

        while b != 0:
            sum = (a^b) & mask
            carry = (a&b) & mask
            a = sum
            b = carry << 1
        
        return a if a <= max_int else ~(a ^ mask)
