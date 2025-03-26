class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        res = float("inf")
        b_count = 0
        
        for i in range(len(blocks)):
            if i - k >= 0 and blocks[i-k] == 'B':
                b_count -= 1

            if blocks[i] == 'B':
                b_count += 1

            res = min(res, k - b_count)

        return res            
        
