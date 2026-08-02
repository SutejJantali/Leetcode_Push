class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];

        for (int[] temp: dp){
            Arrays.fill(temp, -1);
        }

        return f(0, n-1, piles, dp) >= 0;
    }

    public int f(int start, int end, int[] piles, int[][] dp){
        if(dp[start][end] != -1)
        return dp[start][end];

        if (start == end){
            return dp[start][end] = piles[start];
        }

        return dp[start][end] = Math.max(
            piles[start] - f(start+1, end, piles, dp),
            piles[end] - f(start, end-1, piles, dp)
        );
    }
}