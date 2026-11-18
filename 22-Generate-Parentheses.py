class Solution:
    def generateParenthesis(self, n: int) -> list[str]:
        res = []

        def f(left, right, s):
            if len(s) == 2*n:
                res.append(s)
                return

            if left < n:
                f(left+1, right, s + "(")
            
            if right < left:
                f(left, right+1, s + ")")
        
        f(0, 0, "")
        
        return res