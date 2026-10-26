class Solution:
    def countIslands(self, grid: List[List[int]], k: int) -> int:
        m = len(grid)
        n = len(grid[0])

        vis = [[False] * n for _ in range(m)]
        res = 0

        def bfs(q, m, n, grid, vis, curr_sum):
            n_row = [-1, 0, 1, 0]
            n_col = [0, -1, 0, 1]
            while q:
                row, col = q.popleft()
                curr_sum += grid[row][col]
                for i in range(4):
                    new_row = row + n_row[i]
                    new_col = col + n_col[i]

                    if new_row >= 0 and new_row < m and new_col >= 0 and new_col < n and vis[new_row][new_col] == False and grid[new_row][new_col] > 0:
                        vis[new_row][new_col] = True
                        q.append([new_row, new_col])
            
            return curr_sum


        for i in range(m):
            for j in range(n):
                if grid[i][j] > 0 and vis[i][j] == False:
                    q = deque([(i, j)])
                    vis[i][j] = True
                    curr_sum = 0
                    if bfs(q, m, n, grid, vis, curr_sum) % k == 0:
                        res += 1
        
        return res