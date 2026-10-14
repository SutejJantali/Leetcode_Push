class Solution:
    def maxSumOfSquares(self, num: int, sum: int) -> str:
        if sum > 9*num:
            return ""
        
        q, r = divmod(sum, 9)
        res = "9"*q

        print(res)

        if r > 0:
            res += str(r)
        
        print(res)
        res += "0" * (num - len(res))

        return res
