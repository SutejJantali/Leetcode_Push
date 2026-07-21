class Solution {
    public int gcd (int a, int b){
        if (b == 0)
        return a;
        return gcd(b, a % b);
    }
    public long gcdSum(int[] nums) {
        int[] p = new int[nums.length];
        p[0] = nums[0];
        int max_num = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++){
            max_num = Math.max(nums[i], max_num);
            p[i] = gcd(nums[i], max_num);
        }
        
        Arrays.sort(p);
        long res = 0;
        for (int i = 0, j = p.length-1; i < j; i++, j--){
            res += gcd(p[i], p [j]);
        }

        return res;
    }
}