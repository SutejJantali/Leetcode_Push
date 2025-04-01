class Solution:
    def myAtoi(self, s: str) -> int:
        if len(s) == 0:
            return 0

        i = 0
        while i < len(s) and s[i] == ' ':
            i += 1
        
        if i == len(s):
            return 0

        neg = 1
        if s[i] == '-':
            neg = -1
            i += 1
        elif s[i] == '+':
            i += 1
        
        res = 0
        while i < len(s) and (s[i] >= '0' and s[i] <= '9'):
            res = res*10 + int(s[i])
            i += 1
        print(res)
       
        res *= neg       
        res = max(-2**31, min(res, 2**31-1))
        return res

