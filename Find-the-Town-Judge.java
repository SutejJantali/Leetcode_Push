1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        if (trust.length == 0 && n == 1){
4            return 1;
5        }
6        int res = 0;
7        int[] indeg = new int[n+1];
8        for (int i = 0; i < trust.length; i++){
9            indeg[trust[i][0]]--;
10            indeg[trust[i][1]]++;
11        }
12
13        for (int i = 0; i < indeg.length; i++){
14            if (indeg[i] == n-1){
15                return i;
16            }
17        }
18
19        return -1;
20    }
21}