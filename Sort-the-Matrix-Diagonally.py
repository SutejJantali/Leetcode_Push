class Solution:
    def diagonalSort(self, grid: List[List[int]]) -> List[List[int]]:
        n = len(grid)
        m = len(grid[0])
        temp = defaultdict(list)
        for i in range(n):
            for j in range(m):
                key = i - j
                temp[key].append(grid[i][j])
        
        for key, val in temp.items():
            temp[key].sort(reverse = True)

        for i in range(n):
            for j in range(m):
                key = i - j
                grid[i][j] = temp[key].pop()
        
        return grid
        