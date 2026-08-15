class Solution {
    public int longestSubsequence(int[] nums) {
        if (nums.length == 0)
        return 0;

        int res = 0;
        boolean allZero = true, flag = true;
        for(int num : nums){
            res = res ^ num;

            if (res > 0){
                allZero = false;
                flag = false;
            }else if (res == 0){
                allZero = true;
            }
        }

        if (allZero == true && flag == false)
        return nums.length - 1;
        else if (allZero == true && flag == true)
        return 0;

        return nums.length;
    }
}