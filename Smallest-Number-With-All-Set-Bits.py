1class Solution:
2    def smallestNumber(self, n: int) -> int:
3        num = 1
4
5        while num < n:
6            num = num*2 + 1
7        
8        return num