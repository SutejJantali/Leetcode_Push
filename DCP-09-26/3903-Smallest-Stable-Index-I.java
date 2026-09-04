class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max_ele = -1;
        for (int i = 0; i < nums.length; i++){
            max_ele = Math.max(max_ele, nums[i]);
            int min_ele = Integer.MAX_VALUE;
            for (int j = i; j < nums.length; j++){
                min_ele = Math.min(min_ele, nums[j]);
            }

            if (max_ele - min_ele <= k)
            return i;
        }

        return -1;
    }
}