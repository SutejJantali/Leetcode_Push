1class Solution:
2    def oddCells(self, m: int, n: int, indices: List[List[int]]) -> int:
3        row = [0]*m
4        col = [0]*n
5
6        for r, c in indices:
7            row[r] ^= 1 
8            col[c] ^= 1
9        
10        odd_row = sum(row)
11        odd_col = sum(col)
12
13        return odd_row*(n-odd_col)+(m-odd_row)*odd_col