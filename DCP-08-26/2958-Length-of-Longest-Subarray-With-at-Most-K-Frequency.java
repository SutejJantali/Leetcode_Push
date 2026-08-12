class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int res = 0, start = 0;

        Map <Integer, Integer> mp = new HashMap();

        for (int end = 0; end < nums.length; end++){
            mp.put(nums[end], mp.getOrDefault(nums[end], 0) + 1);

            while(mp.get(nums[end]) > k){
                mp.put(nums[start], mp.get(nums[start]) - 1);
                start += 1;
            }

            res = Math.max(res, end - start + 1);
        }

        return res;
    }
}