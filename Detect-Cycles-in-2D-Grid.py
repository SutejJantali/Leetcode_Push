1class UnionFind:
2    def __init__(self, n : int):
3        self.n = n
4        self.setCount = n
5        self.parent = list(range(n))
6        self.size = [1] * n
7    
8    def findSet(self, x: int) -> int:
9        if self.parent[x] == x:
10            return x
11        # Path compression (makes it fast!)
12        self.parent[x] = self.findSet(self.parent[x])
13        return self.parent[x]
14    
15    def unite(self, x: int, y: int):
16        if self.size[x] < self.size[y]:
17            x, y = y, x
18        self.parent[y] = x
19        self.size[x] += self.size[y]
20        self.setCount -= 1
21
22    def findAndUnite(self, x : int, y : int) -> bool:
23        parentX, parentY = self.findSet(x), self.findSet(y)
24        if parentX != parentY:
25            self.unite(parentX, parentY)
26            return True
27        return False
28
29class Solution:
30    def containsCycle(self, grid: List[List[str]]) -> bool:
31        m = len(grid)
32        n = len(grid[0])
33
34        uf = UnionFind(m*n)
35        for i in range(m):
36            for j in range(n):
37                if i > 0 and grid[i][j] == grid[i-1][j]:
38                    if uf.findAndUnite(i*n+j, (i-1)*n+j) == False:
39                        return True
40                if j > 0 and grid[i][j] == grid[i][j-1]:
41                    if uf.findAndUnite(i*n+j, i*n+(j-1)) == False:
42                        return True
43        return False