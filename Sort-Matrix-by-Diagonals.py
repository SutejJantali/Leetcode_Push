class Solution:
    def sortMatrix(self, grid: List[List[int]]) -> List[List[int]]:
        n = len(grid)
        temp = defaultdict(list)
        for i in range(n):
            for j in range(n):
                key = i - j
                temp[key].append(grid[i][j])
        
        for key, val in temp.items():
            if key >= 0:
                temp[key].sort()
            else:
                temp[key].sort(reverse = True)

        for i in range(n):
            for j in range(n):
                key = i - j
                grid[i][j] = temp[key].pop()
        
        return grid
        