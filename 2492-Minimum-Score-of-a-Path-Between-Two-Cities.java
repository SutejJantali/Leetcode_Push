class Solution {
    public int parent(int[] root, int node){
        if (root[node] == node)
        return node;

        return root[node] = parent(root, root[node]);
    }
    public int minScore(int n, int[][] roads) {
        int[] root = new int[n+1];

        for (int i = 0; i <= n; i++){
            root[i] = i;
        }

        for (int[] r : roads){
            root[parent(root, r[0])] = parent(root, r[1]);
        }

        int res = Integer.MAX_VALUE;

        for (int[] r : roads){
            if (parent(root, r[0]) == parent(root, 1))
            res = Math.min(res, r[2]); 
        }


        return res;
    }
}
//https://leetcode.com/problems/minimum-score-of-a-path-between-two-cities/solutions/8374288/solution-by-la_castille-90ks