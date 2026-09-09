class Solution:
    def countCommas(self, n: int) -> int:
        res = 0
        threshold = 1000
        
        # Keep adding commas for each threshold (1,000, 1,000,000, etc.)
        while n >= threshold:
            res += (n - threshold + 1)
            threshold *= 1000  # Move to the next comma tier
            
        return res
