class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0, res = 0, left = 0;
        for (int num : nums)
        total += num;

        int curr_sum = 0, target = total - x;

        if (target < 0) return -1; 

        if (target == 0) return nums.length; 

        for (int right = 0; right < nums.length; right++){
            curr_sum += nums[right];

            while (curr_sum > target && left <= right){
                curr_sum -= nums[left++];
            }

            if (curr_sum == target){
                res = Math.max(res, right - left + 1);
            }
        }

        return res != 0 ? nums.length - res : -1;
    }
}