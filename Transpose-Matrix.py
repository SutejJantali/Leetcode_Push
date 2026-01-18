1class Solution:
2    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
3        res = [[0 for _ in range(len(matrix))] for _ in range(len(matrix[0]))]
4
5        for i in range(len(matrix)):
6            for j in range(len(matrix[0])):
7                res[j][i] = matrix[i][j]
8
9        return res