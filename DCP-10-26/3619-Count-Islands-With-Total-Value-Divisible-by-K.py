class Solution:
    def countIslands(self, grid: List[List[int]], k: int) -> int:
        m = len(grid)
        n = len(grid[0])

        vis = [[False] * n for _ in range(m)]
        res = 0

        def dfs(i, j, m, n, grid, vis, curr_sum):
            n_row = [-1, 0, 1, 0]
            n_col = [0, -1, 0, 1]
            row, col = i, j
            curr_sum = grid[row][col]
            vis[row][col] = True

            for i in range(4):
                new_row = row + n_row[i]
                new_col = col + n_col[i]

                if new_row >= 0 and new_row < m and new_col >= 0 and new_col < n and vis[new_row][new_col] == False and grid[new_row][new_col] > 0:
                    curr_sum = curr_sum + dfs(new_row, new_col, m, n, grid, vis, curr_sum)
            
            return curr_sum


        for i in range(m):
            for j in range(n):
                if grid[i][j] > 0 and vis[i][j] == False:
                    curr_sum = 0
                    if dfs(i, j, m, n, grid, vis, curr_sum) % k == 0:
                        res += 1
        
        return res