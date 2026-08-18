class Solution {
    public int largestInteger(int[] nums, int k) {
        int res = -1;

        if (k == nums.length){
            for (int i = 0; i < k; i++){
                res = Math.max(res, nums[i]);
            }

            return res;
        }
        Map <Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i <= nums.length - k; i++){
            for (int j = i; j < i + k; j++){
                mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if (entry.getValue() == 1){
                res = Math.max(res, entry.getKey());
            }
        }

        return res;
    }
}