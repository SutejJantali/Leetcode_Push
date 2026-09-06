class Solution {
    public int countGoodRotations(int[] nums) {
        int res = 0;
        long sum = 0, pre = 0;

        for(int num : nums)
        sum += num;

        for (int i = 0; i < nums.length; i++){
            if (i >= nums.length/2){
                if (pre != sum - pre)
                res += 1;

                pre -= nums[i-nums.length/2];
            }

            pre += nums[i];
        }

        return res;
    }
}

//https://leetcode.com/problems/count-good-cyclic-rotations/solutions/8504924/sliding-window-simple-observation-relati-xpau