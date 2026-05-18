1class Solution {
2    public int maxFrequency(int[] nums, int k) {
3        Arrays.sort(nums);
4        int res = 0, left = 0;
5        long curr_sum = 0;
6         
7        for (int right = 0; right < nums.length; right++){
8            curr_sum += nums[right];
9
10            while (curr_sum + k < (long)nums[right] * (right - left + 1)){
11                curr_sum -= nums[left];
12                left += 1;
13            }
14
15            res = Math.max(res, right - left + 1);
16        }
17
18        return res;
19    }
20}