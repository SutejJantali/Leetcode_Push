1class Solution {
2    public int minPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int res = 0;
5
6        for (int i = 0; i < nums.length/2; i++){
7            res = Math.max(res, nums[nums.length-i-1] + nums[i]);
8        }
9
10        return res;
11    }
12}