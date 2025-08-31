class Solution:
    def tictactoe(self, moves: List[List[int]]) -> str:
        #Create Board with all moves of X and O
        board = [[""]*3 for _ in range(3)]

        #Fill board
        x_Play = True
        for r, c in moves:
            board[r][c] = "X" if x_Play else "O"
            x_Play = not x_Play

        #Iterate all rows and cols
        for i in range(3):
            if board[i][0] and board[i][0] == board[i][1] and board[i][0] == board[i][2]:
                return "A" if board[i][0] == "X" else "B"
            if board[0][i] and board[0][i] == board[1][i] and board[0][i] == board[2][i]:
                return "A" if board[0][i] == "X" else "B"

        #Iterate all diagonals
        if board[1][1] and ((board[0][0] == board[1][1] == board[2][2]) or (board[0][2] == board[1][1] == board[2][0])):
            return "A" if board[1][1] == "X" else "B"
 
        return "Draw" if len(moves) == 9 else "Pending"