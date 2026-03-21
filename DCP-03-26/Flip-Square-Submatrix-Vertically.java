1class Solution {
2    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
3        for (int i0 = x, i1 = x + k - 1; i0 < i1; i0++, i1--) {
4            for (int j = y; j < y + k; j++) {
5                int temp = grid[i0][j];
6                grid[i0][j] = grid[i1][j];
7                grid[i1][j] = temp;
8            }
9        }
10        return grid;
11    }
12}