1class Solution:
2    def maximalRectangle(self, matrix: List[List[str]]) -> int:
3        if len(matrix) == 0 or len(matrix[0]) == 0:
4            return 0
5        
6        for i in range(len(matrix)):
7            for j in range(len(matrix[0])):
8                matrix[i][j] = int(matrix[i][j])
9
10        for i in range(len(matrix)):
11            for j in range(1, len(matrix[0])):
12                if matrix[i][j] == 1:
13                    matrix[i][j] += matrix[i][j-1]
14        
15        res = 0
16
17        for j in range(len(matrix[0])):
18            for i in range(len(matrix)):
19                width = matrix[i][j]
20
21                if width == 0:
22                    continue
23
24                curr_width = width
25                k = i
26                while k < len(matrix) and matrix[k][j] > 0:
27                    curr_width = min(curr_width, matrix[k][j])
28                    height = k - i + 1
29                    res = max(res, curr_width * height)
30                    k += 1
31        
32        return res