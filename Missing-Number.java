1class Solution {
2    public int missingNumber(int[] nums) {
3        Arrays.sort(nums);
4
5        if (nums[nums.length-1] == nums.length-1){
6            return nums.length;
7        }
8
9        for (int i = 0; i < nums.length; i++){
10            if (i != nums[i]){
11                return i;
12            }
13        }
14        return -1;
15    }
16}