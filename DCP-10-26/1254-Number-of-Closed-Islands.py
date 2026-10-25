class Solution:
    def closedIsland(self, grid: list[list[int]]) -> int:
        m = len(grid)
        n = len(grid[0])

        vis = [[False] * n for i in range(m)]
        res = 0

        def bfs(row, col, vis, grid):
            q = deque([(row, col)])
            vis[row][col] = True
            isClosed = True

            n_row = [-1, 0, 1, 0]
            n_col = [0, -1, 0, 1]

            while q:
                row, col = q.popleft()

                if row == 0 or row == m - 1 or col == 0 or col == n - 1:
                    isClosed = False
                    
                for i in range(4):
                    new_row = n_row[i] + row
                    new_col = n_col[i] + col

                    if new_row >= 0 and new_row < m and new_col >= 0 and new_col < n and grid[new_row][new_col] == 0 and vis[new_row][new_col] == False:
                        q.append((new_row, new_col))
                        vis[new_row][new_col] = True


            return isClosed


        for i in range(m):
            for j in range(n):
                if grid[i][j] == 0 and vis[i][j] == False and bfs(i, j, vis, grid) == True:
                    res += 1

        return res