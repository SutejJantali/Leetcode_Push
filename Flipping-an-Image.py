1class Solution:
2    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
3        for i in range(len(image)):
4            image[i] = list(reversed(image[i]))
5        
6        for i in range(len(image)):
7            for j in range(len(image[0])):
8                if image[i][j] == 0:
9                    image[i][j] = 1
10                else:
11                    image[i][j] = 0
12        
13        return image