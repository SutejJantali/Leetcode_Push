1class Solution {
2    public int maxCount(int m, int n, int[][] ops) {
3        int min_row = m, min_col = n;
4        for (int i = 0; i < ops.length; i++){
5            min_row = Math.min(min_row, ops[i][0]);
6            min_col = Math.min(min_col, ops[i][1]);
7        }
8
9        return min_row * min_col;
10    }
11}