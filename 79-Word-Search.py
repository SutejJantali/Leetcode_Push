class Solution:
    def exist(self, board: list[list[str]], word: str) -> bool:
        m = len(board)
        n = len(board[0])
        vis = [[False for i in range(n)] for j in range(m)]

        def dfs(index, row, col, vis, board, word):
            vis[row][col] = True

            if index == len(word)-1:
                return True
            
            new_row = [-1, -0 , 1, 0]
            new_col = [0, -1, 0, 1]

            for i in range(4):
                nrow = row + new_row[i]
                ncol = col + new_col[i]

                if nrow >= 0 and nrow < m and ncol >= 0 and ncol < n and vis[nrow][ncol] == False and word[index+1] == board[nrow][ncol]:
                    if dfs(index+1, nrow, ncol, vis, board, word) == True:
                        return True
            
            vis[row][col] = False
            return False

        for i in range(m):
            for j in range(n):
                if word[0] == board[i][j]:
                    if dfs(0, i, j, vis, board, word) == True:
                        return True
        
        return False