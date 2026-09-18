class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int res = Integer.MAX_VALUE;

        for (int len = l; len <= r; len++) {
            int left = 0;
            int curr_sum = 0;

            for (int right = 0; right < nums.size(); right++) {
                curr_sum += nums.get(right);

                if (right - left + 1 == len) {
                    if (curr_sum > 0) {
                        res = Math.min(res, curr_sum);
                    }

                    curr_sum -= nums.get(left);
                    left++;
                }
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}