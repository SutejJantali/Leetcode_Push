1class Solution {
2    public int numSpecial(int[][] mat) {
3        int res = 0;
4        for (int i = 0; i < mat.length; i++){
5            for (int j = 0; j < mat[0].length; j++){
6                if (mat[i][j] == 0){
7                    continue;
8                }
9                boolean flag = false;
10
11                for (int r = 0; r < mat.length; r++){
12                    if (r != i && mat[r][j] == 1){
13                        flag = true;
14                        break;
15                    }
16                }
17
18                for (int c = 0; c < mat[0].length; c++){
19                    if (c != j && mat[i][c] == 1){
20                        flag = true;
21                        break;
22                    }
23                }
24
25                if (flag == false)
26                res += 1;
27            }
28        }
29
30        return res;
31    }
32}