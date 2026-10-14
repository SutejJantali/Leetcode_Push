class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        m = len(grid)
        n = len(grid[0])

        vis = [[-1 for i in range(n)] for j in range(m)]

        def bfs(q, vis, grid):

            new_row = [-1, 0, 1, 0]
            new_col = [0, -1, 0, 1]

            while len(q) > 0:
                row, col = q.popleft()
                for i in range(4):
                    nrow = row + new_row[i]
                    ncol = col + new_col[i]

                    if nrow >= 0 and nrow < m and ncol >= 0 and ncol < n and vis[nrow][ncol] == -1 and grid[nrow][ncol] == "1":
                        vis[nrow][ncol] = 1
                        q.append([nrow, ncol])
        
        res = 0

        for i in range(m):
            for j in range(n):
                if grid[i][j] == "1" and vis[i][j] == -1:
                    q = deque([(i, j)])
                    res += 1
                    bfs(q, vis, grid)

        return res