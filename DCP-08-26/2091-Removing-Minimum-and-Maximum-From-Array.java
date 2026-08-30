class Solution {
    public int minimumDeletions(int[] nums) {
        if (nums.length <= 1)
        return nums.length;

        int min_pos = 0, max_pos = 0, min_ele = nums[0], max_ele = nums[0];

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > max_ele){
                max_ele = nums[i];
                max_pos = i;
            }
            if (nums[i] < min_ele){
                min_ele = nums[i];
                min_pos = i;
            }
        }

        // Fix 3: Group positions by relative order (leftmost vs rightmost)
        int left = Math.min(min_pos, max_pos);
        int right = Math.max(min_pos, max_pos);
        int n = nums.length;

        // Fix 4: Calculate the 3 clear deletion strategies directly
        int delLeft = right + 1;                  // Path 1: Delete both from the left side
        int delRight = n - left;                  // Path 2: Delete both from the right side
        int delBoth = (left + 1) + (n - right);   // Path 3: Delete one from each side

        // Return the best option
        return Math.min(delLeft, Math.min(delRight, delBoth));
    }
}