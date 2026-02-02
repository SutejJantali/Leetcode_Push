1class Solution {
2    public boolean isToeplitzMatrix(int[][] matrix) {
3        for (int i = 1; i < matrix.length; i++){
4            for (int j = 1; j < matrix[0].length; j++){
5                if (matrix[i-1][j-1] != matrix[i][j]){
6                    return false;
7                }
8            }
9        }
10
11        return true;
12    }
13}