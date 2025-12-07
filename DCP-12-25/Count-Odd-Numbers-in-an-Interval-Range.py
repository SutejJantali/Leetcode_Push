1class Solution:
2    def countOdds(self, low: int, high: int) -> int:
3        total_num = high - low + 1
4
5        if low % 2 != 0 and high % 2 != 0:
6            return total_num//2 + 1
7        
8        return total_num // 2