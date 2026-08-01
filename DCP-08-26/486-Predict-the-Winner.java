class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        if (n == 1)
        return true;
        
        int[][] dp = new int[n][n];

        for (int[] temp: dp){
            Arrays.fill(temp, -1);
        }

        return f(0, n-1, nums, dp) >= 0;
    }

    public int f(int start, int end, int[] nums, int[][] dp){
        if(dp[start][end] != -1)
        return dp[start][end];

        if (start == end)
        return dp[start][end] = nums[start];

        return dp[start][end] = Math.max(
            nums[start] - f(start+1, end, nums, dp),
            nums[end] - f(start, end-1, nums, dp)
        );
    }
}