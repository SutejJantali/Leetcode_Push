class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        num = []
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                num.append(grid[i][j])
        
        num = sorted(num)
        a, b = -1, -1
        for i in range(len(num)-1):
            if num[i] == num[i+1]:
                a = num[i]
            elif num[i] + 1 != num[i+1]:
                b = num[i] + 1
        
        if b == -1 and num[0] != 1:
            b = 1
        elif b == -1:
            b = num[len(num)-1]+1
        
        return [a, b]

