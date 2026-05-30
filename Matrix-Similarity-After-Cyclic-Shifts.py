1class Solution:
2    def areSimilar(self, mat: List[List[int]], k: int) -> bool:
3        k = k % len(mat[0])
4
5        for i in range(len(mat)):
6            for j in range(len(mat[0])):
7                if i % 2 == 0:
8                    if mat[i][j] != mat[i][(j + k) % len(mat[0])]:
9                        return False
10                else:
11                    if mat[i][j] != mat[i][(j - k) % len(mat[0])]:
12                        return False
13        
14        return True