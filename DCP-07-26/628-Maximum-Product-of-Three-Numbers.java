class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int prod1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int prod2 =  nums[nums.length - 1]*nums[0]*nums[1];
        int max_product = Math.max(prod1, prod2);
        return max_product;
    }
}