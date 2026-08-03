class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++){
            dp[i] = -1;
        }

        int diff = f(0, stoneValue, dp);
        if (diff > 0){
            return "Alice";
        }
        else if (diff < 0){
            return "Bob";
        }

        return "Tie";
    }

    public int f(int ind, int[] stoneValue, int[] dp){
        if (ind >= stoneValue.length)
        return 0;

        if (dp[ind] != -1)
        return dp[ind];

        int take = 0;
        int best = Integer.MIN_VALUE;
        for (int i = 0; i < 3 && ind + i < stoneValue.length; i++){
            take += stoneValue[i+ind];
            best = Math.max(best, take - f(i + ind + 1, stoneValue, dp));
        }

        return dp[ind] = best;
    }
}