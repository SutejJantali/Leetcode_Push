class Solution:
    def longestNiceSubstring(self, s: str) -> str:
        if len(s) < 2:
            return ""

        res = ""

        for i in range(len(s)):
            lower = set()
            upper = set()

            for j in range(i, len(s)):
                if s[j].islower():
                    lower.add(s[j])
                else:
                    upper.add(s[j])
                
                nice = True

                for c in lower:
                    if c.upper() not in upper:
                        nice = False
                        break
                    
                for c in upper:
                    if c.lower() not in lower:
                        nice = False
                        break
                    
                if nice and (j - i + 1) > len(res):
                    res = s[i : j + 1]
            
        return res