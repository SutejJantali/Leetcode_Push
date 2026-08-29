class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int res = 0, pos = 0;
        for (int i = 0; i < nums.length; i++){
            pos += nums[i];
            if (pos == 0)
            res += 1;
        }

        return res;
    }
}