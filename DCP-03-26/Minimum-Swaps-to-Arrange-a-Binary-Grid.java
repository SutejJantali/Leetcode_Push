1class Solution {
2    public int minSwaps(int[][] grid) {
3        int[] pos = new int[grid.length];
4        Arrays.fill(pos, -1);
5
6        for (int i = 0; i < grid.length; i++){
7            for (int j = grid.length-1; j >= 0; j--){
8                if (grid[i][j] == 1){
9                    pos[i] = j;
10                    break;
11                }
12            }
13        }
14
15        int res = 0;
16        for (int i = 0; i < grid.length; i++){
17            int k = -1;
18            for (int j = i; j < grid.length; j++){
19                if (pos[j] <= i){
20                    res += j-i;
21                    k = j;
22                    break;
23                }
24            }
25
26            if (k >= 0){
27                for (int j = k; j > i; j--){
28                    int temp = pos[j];
29                    pos[j] = pos[j-1];
30                    pos[j-1] = temp;
31                }
32            }
33            else{
34                return -1;
35            }
36        }
37        return res;
38    }
39}