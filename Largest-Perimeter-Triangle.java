1class Solution {
2    public int largestPerimeter(int[] nums) {
3        Arrays.sort(nums);
4
5        for (int i = nums.length-3; i > -1; i--){
6            if (nums[i] + nums[i+1] > nums[i+2]){
7                return nums[i] + nums[i+1] + nums[i+2];
8            }
9        }
10        return 0;
11    }
12}