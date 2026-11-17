class Solution:
    def countBits(self, n: int) -> list[int]:
        res = [0]
        curr = 1
        while curr <= n:
            temp = 0
            next_curr = curr + 1
            while curr:
                if curr & 1 == 1:
                    temp += 1
                
                curr >>= 1

            res.append(temp)
            curr = next_curr
        
        return res