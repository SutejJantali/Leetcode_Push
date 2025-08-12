class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        x_or_y, res = x ^ y, 0

        while x_or_y > 0:
            res += x_or_y & 1
            x_or_y = x_or_y >> 1
        
        return res