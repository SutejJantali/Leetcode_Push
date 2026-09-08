class Solution:
    def countCommas(self, n: int) -> int:
        res = 0

        for i in range(999, n):
            res += 1
        
        return res