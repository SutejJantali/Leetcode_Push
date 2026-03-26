1class Solution:
2    def isCovered(self, ranges: List[List[int]], left: int, right: int) -> bool:
3        for num in range(left, right+1):
4            found = False
5            for start, end in ranges:
6                if start <= num <= end:
7                    found = True
8                    break
9            if found == False:
10                return False
11        
12        return True