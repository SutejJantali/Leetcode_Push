1class Solution {
2    public int minOperations(int[][] grid, int x) {
3        ArrayList <Integer> linear_grid = new ArrayList<>();
4        int res = 0;
5
6        for (int i = 0; i < grid.length; i++){
7            for (int j = 0; j < grid[0].length; j++){
8                linear_grid.add(grid[i][j]);
9            }
10        }
11
12        Collections.sort(linear_grid);
13
14        int mean_grid = linear_grid.get(linear_grid.size()/2);
15
16        for (int i = 0; i < linear_grid.size(); i++){
17            if (linear_grid.get(i) % x != mean_grid % x)
18            return -1;
19
20            res += Math.abs(linear_grid.get(i) - mean_grid) / x;
21        }
22
23        return res;
24    }
25}