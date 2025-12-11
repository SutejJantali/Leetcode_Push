1class Solution:
2    def countCoveredBuildings(self, n: int, buildings: List[List[int]]) -> int:
3        rmax = [0] * (n+1)
4        rmin = [n+1]*(n+1)
5        cmax = [0] * (n+1)
6        cmin = [n+1]*(n+1)
7
8        for x, y in buildings:
9            rmax[y] = max(rmax[y], x)
10            rmin[y] = min(rmin[y], x)
11            cmax[x] = max(cmax[x], y)
12            cmin[x] = min(cmin[x], y)
13
14        res = 0
15
16        for x, y in buildings:
17            if rmin[y] < x < rmax[y] and cmin[x] < y < cmax[x]:
18                res += 1
19        
20        return res