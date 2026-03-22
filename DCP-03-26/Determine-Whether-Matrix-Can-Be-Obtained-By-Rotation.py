1class Solution:
2    def findRotation(self, mat: List[List[int]], target: List[List[int]]) -> bool:
3        
4        for _ in range(4): 
5            match = True
6            
7            for i in range(len(mat)):
8                if mat[i] != target[i]:   
9                    match = False
10                    break
11            
12            if match:
13                return True
14            
15            mat = [list(row) for row in zip(*mat[::-1])]             # transpose + reverse rows = 90° rotation
16        
17        return False