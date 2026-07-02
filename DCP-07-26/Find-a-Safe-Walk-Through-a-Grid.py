1class Solution:
2    def findSafeWalk(self, grid: List[List[int]], health: int) -> bool:
3        m, n = len(grid), len(grid[0])
4
5        dis = [[-1]*n for _ in range(m)]
6
7        dirs = [(0, 1), (1, 0), (0, -1), (-1, 0)]
8
9        pq = [(grid[0][0], 0, 0)]
10
11        while pq:
12            val, cx, cy = heapq.heappop(pq)
13
14            if dis[cx][cy] >= 0:
15                continue
16
17            dis[cx][cy] = val
18
19            for dx, dy in dirs:
20                nx, ny = cx + dx, cy + dy
21
22                if nx >= 0 and nx < m and ny >= 0 and ny < n and dis[nx][ny] == -1:
23                    heapq.heappush(pq, (val + grid[nx][ny], nx, ny))
24
25        return dis[m-1][n-1] < health 