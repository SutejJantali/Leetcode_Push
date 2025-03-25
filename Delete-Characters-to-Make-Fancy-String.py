class Solution:
    def makeFancyString(self, s: str) -> str:
        count = 1
        res = s[0]
        for i in range(1, len(s)):
            if s[i] == s[i-1]:
                count += 1
            elif s[i] != s[i-1]:
                count = 1
            
            if count < 3:
                res+= s[i]
        
        return res