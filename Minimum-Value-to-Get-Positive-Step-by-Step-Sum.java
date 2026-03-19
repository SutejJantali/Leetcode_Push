1class Solution {
2    public int minStartValue(int[] nums) {
3        int pre_sum = 0, res = 0;
4
5        for (int i = 0; i < nums.length; i++){
6            pre_sum += nums[i];
7            res = Math.min(pre_sum, res);
8        }
9
10        return 1 - res;
11    }
12}