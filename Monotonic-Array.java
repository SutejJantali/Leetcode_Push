1class Solution {
2    public boolean isMonotonic(int[] nums) {
3        boolean inc_flag = false, dec_flag = false;
4        int curr_sum = 0;
5        for (int i = 1; i < nums.length; i++){
6            if (nums[i] > nums[i-1])
7            inc_flag = true;
8
9            if (nums[i] < nums[i-1])
10            dec_flag = true;
11        }
12        return !inc_flag || !dec_flag;
13    }
14}