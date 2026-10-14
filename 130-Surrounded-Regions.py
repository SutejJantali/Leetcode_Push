class Solution:
    def solve(self, board: list[list[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        m = len(board)
        n = len(board[0])
        vis = [[-1 for i in range(n)] for j in range(m)]

        def dfs(row, col, board, vis):
            vis[row][col] = 1

            new_row = [-1, 0, 1, 0]
            new_col = [0, -1, 0 ,1]

            for i in range(4):
                nrow = row + new_row[i]
                ncol = col + new_col[i]

                if nrow >= 0 and nrow < m and ncol >= 0 and ncol < n and vis[nrow][ncol] == -1 and board[nrow][ncol] == 'O':
                    dfs(nrow, ncol, board, vis)
            
        
        
        for i in range(m):
            if board[i][0] == 'O' and vis[i][0] == -1:
                dfs(i, 0, board, vis)
            if board[i][n-1] == 'O' and vis[i][n-1] == -1:
                dfs(i, n-1, board, vis)

        for i in range(n):
            if board[0][i] == 'O' and vis[0][i] == -1:
                dfs(0, i, board, vis)
            if board[m-1][i] == 'O' and vis[m-1][i] == -1:
                dfs(m-1, i, board, vis)

        for i in range(m):
            for j in range(n):
                if vis[i][j] == -1 and board[i][j] == 'O':
                    board[i][j] = 'X'

        return board