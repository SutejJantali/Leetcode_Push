class Solution:
    def minOperations(self, grid: List[List[int]], x: int) -> int:
        numbers = []
        for row in grid:
            for num in row:
                numbers.append(num)

        numbers.sort()

        mean_num = numbers[len(numbers) // 2]
        res = 0
        for num in numbers:
            if num % x != mean_num % x:
                return -1
            
            res += abs(mean_num - num) // x
        
        return res