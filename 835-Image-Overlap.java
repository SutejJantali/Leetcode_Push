class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;

        List<int[]> a = new ArrayList<>();
        List<int[]> b = new ArrayList<>();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (img1[i][j] == 1)
                a.add(new int[]{i, j});

                if (img2[i][j] == 1)
                b.add(new int[]{i, j});
            }
        }

        int[][] counter = new int[2*n][2*n];
        int res = 0;

        for (int[] i : a){
            for (int[] j : b){
                int dx = j[0] - i[0] + n;
                int dy = j[1] - i[1] + n;

                counter[dx][dy] += 1;    
                res = Math.max(res, counter[dx][dy]);
            }
        }

        return res;
    }
}