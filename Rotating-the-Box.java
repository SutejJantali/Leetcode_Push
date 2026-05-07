1class Solution {
2    public char[][] rotateTheBox(char[][] boxGrid) {
3        int rows = boxGrid.length, cols = boxGrid[0].length;
4        for (int r = 0; r < rows; r++){
5            int p = 0;
6            for (int c = 0; c < cols; c++){
7                if (boxGrid[r][c] == '.'){
8                    char temp = boxGrid[r][c];
9                    boxGrid[r][c] = boxGrid[r][p];
10                    boxGrid[r][p] = temp;
11                    p += 1;
12                }
13                else if (boxGrid[r][c] == '*'){
14                    p = c + 1;
15                }
16            }
17        }
18
19        char[][] res = new char[cols][rows];
20        for (int r = 0; r < rows; r++){
21            for (int c = 0; c < cols; c++){
22                res[c][rows - 1 - r] = boxGrid[r][c];
23            }
24        }
25
26        return res;
27    }
28}