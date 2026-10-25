class Solution:
    def closedIsland(self, grid: list[list[int]]) -> int:
        m = len(grid)
        n = len(grid[0])

        vis = [[False] * n for i in range(m)]
        res = 0

        def dfs(row, col, vis, grid):
            vis[row][col] = True
            isClosed = True

            if row == 0 or row == m-1 or col == 0 or col == n-1:
                isClosed = False

            n_row = [-1, 0, 1, 0]
            n_col = [0, -1, 0, 1]

            for i in range(4):
                new_row = n_row[i] + row
                new_col = n_col[i] + col

                if new_row >= 0 and new_row < m and new_col >= 0 and new_col < n and grid[new_row][new_col] == 0 and vis[new_row][new_col] == False:
                    isClosed = isClosed & dfs(new_row, new_col, grid, vis)

            return isClosed


        for i in range(m):
            for j in range(n):
                if grid[i][j] == 0 and vis[i][j] == False and dfs(i, j, vis, grid) == True:
                    res += 1

        return res