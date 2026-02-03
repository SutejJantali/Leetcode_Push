1class Solution {
2    public int smallestRangeI(int[] nums, int k) {
3        int min_nums = nums[0], max_nums = nums[0];
4
5        for (int i = 0; i < nums.length; i++){
6        min_nums = Math.min(nums[i], min_nums);
7            max_nums = Math.max(nums[i], max_nums);
8        }
9
10        return Math.max(0, (max_nums-k)-(min_nums+k));
11    }
12}