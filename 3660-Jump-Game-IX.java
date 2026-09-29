class Solution {
    public int[] maxValue(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        int[] res = new int[nums.length];

        pre[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            pre[i] = Math.max(pre[i-1], nums[i]);
        }

        suf[nums.length-1] = nums[nums.length-1];
        for (int i = nums.length-2; i >= 0; i--){
            suf[i] = Math.min(suf[i+1], nums[i]);
        }

        res[nums.length-1] = pre[nums.length-1];

        for (int i = nums.length-2; i >= 0; i--){
            if (pre[i] > suf[i+1])
            res[i] = res[i+1];
            else
            res[i] = pre[i];
        }

        return res;
    }
}
//https://leetcode.com/problems/jump-game-ix/solutions/8156307/greedy-simple-prefix-suffix-on-by-aryanm-dhg9