1class Solution:
2    def countTriples(self, n: int) -> int:
3        res = 0
4        for i in range(1, n+1):
5            for j in range(1, n+1):
6                c = int(sqrt(i ** 2 + j ** 2))
7                if c <= n and c ** 2 == i ** 2 + j ** 2:
8                    res += 1
9        
10        return res