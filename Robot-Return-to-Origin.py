class Solution:
    def judgeCircle(self, moves: str) -> bool:
        left_count, up_count = 0, 0

        for move in moves:
            if move == "L":
                left_count += 1
            elif move == "R":
                left_count -= 1
            elif move == "U":
                up_count += 1
            else:
                up_count -= 1
        
        return True if up_count == 0 and left_count == 0 else False