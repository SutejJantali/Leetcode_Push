1class Solution:
2    def numSub(self, s: str) -> int:
3        total = 0
4        consecutive = 0
5
6        for i in range(len(s)):
7            if s[i] == '0':
8                total += consecutive *(consecutive+1)//2
9                consecutive = 0
10            else:
11                consecutive += 1
12        
13        total += consecutive *(consecutive+1)//2
14        total %= 10**9 + 7
15        return total
16