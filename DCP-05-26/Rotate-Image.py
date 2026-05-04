1class Solution:
2    def rotate(self, matrix: List[List[int]]) -> None:
3        """
4        Do not return anything, modify matrix in-place instead.
5        """
6        for i in range(len(matrix)):
7            for j in range(i+1, len(matrix)):
8                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
9
10
11        for row in matrix:
12            row.reverse()     