from collections import deque

class Solution:
    def orangesRotting(self, grid: list[list[int]]) -> int:
        m = len(grid)
        n = len(grid[0])
        
        # 1. Single queue to hold ALL initial rotten oranges collectively
        q = deque()
        fresh_count = 0
        
        for i in range(m):
            for j in range(n):
                if grid[i][j] == 2:
                    q.append((i, j))
                elif grid[i][j] == 1:
                    fresh_count += 1
                    
        # If there are no fresh oranges from the start, no time is needed
        if fresh_count == 0:
            return 0
            
        minutes = 0
        new_row = [-1, 0, 1, 0]
        new_col = [0, -1, 0, 1]
        
        # 2. Multi-source BFS wave-by-wave
        while q and fresh_count > 0:
            minutes += 1  # A new minute starts for the entire current layer
            
            # Freeze the queue size to only process the current layer's wave
            current_wave_size = len(q)
            
            for _ in range(current_wave_size):
                row, col = q.popleft()
                
                for i in range(4):
                    nrow = row + new_row[i]
                    ncol = col + new_col[i]
                    
                    # If neighbor is a valid fresh orange, rot it
                    if 0 <= nrow < m and 0 <= ncol < n and grid[nrow][ncol] == 1:
                        grid[nrow][ncol] = 2  # Mutate in-place
                        fresh_count -= 1       # Reduce remaining fresh count
                        q.append((nrow, ncol)) # Add to next minute's wave
                        
        # 3. If fresh oranges are still left, it's impossible to rot everything
        return minutes if fresh_count == 0 else -1
