class Solution {
    public int uniqueXorTriplets(int[] nums) {
        if (nums.length <= 2)
        return nums.length;

        int res = 0;
        for (int num : nums){
            res |= num;
        }

        return res + 1;
    }
}
//https://leetcode.com/problems/number-of-unique-xor-triplets-i/solutions/8414031/100-observation-on-simple-idea-that-solv-7ld5