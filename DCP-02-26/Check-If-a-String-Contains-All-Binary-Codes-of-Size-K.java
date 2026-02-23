1class Solution:
2    def hasAllCodes(self, s: str, k: int) -> bool:
3        res = set()
4        target = 1 << k
5        for i in range(len(s)-k+1):
6            sub = s[i:i+k]
7            res.add(sub)
8            if len(res) == target:
9                return True
10        
11        return len(res) == target