1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int res_index = 2;
4
5        for (int i = 2; i < nums.length; i++){
6            if (nums[res_index-2] != nums[i]){
7                nums[res_index] = nums[i];
8                res_index += 1;
9            }
10        }
11
12        return res_index;
13    }
14}