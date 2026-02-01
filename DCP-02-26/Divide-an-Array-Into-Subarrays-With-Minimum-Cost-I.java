1class Solution {
2    public int minimumCost(int[] nums) {
3        Arrays.sort(nums, 1, nums.length);
4
5        return nums[0] + nums[1] + nums[2];
6    }
7}