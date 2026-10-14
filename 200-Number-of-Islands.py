class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        m = len(grid)
        n = len(grid[0])

        vis = [[-1 for i in range(n)] for k in range(m)]

        def dfs(row, col, grid, vis):
            vis[row][col] = 1

            new_row = [-1, 0, 1, 0]
            new_col = [0, -1, 0, 1]

            for i in range(4):
                nrow = row + new_row[i]
                ncol = col + new_col[i]

                if nrow >= 0 and nrow < m and ncol >= 0 and ncol < n and vis[nrow][ncol] == -1 and grid[nrow][ncol] == "1":
                    dfs(nrow, ncol, grid, vis)

        res = 0
        for i in range(m):
            for j in range(n):
                if vis[i][j] == -1 and grid[i][j] == "1":
                    res += 1
                    dfs(i, j, grid, vis)

        return res