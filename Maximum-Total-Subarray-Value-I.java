1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3        int res = 0, max_num = Integer.MIN_VALUE, min_num = Integer.MAX_VALUE;
4
5        for (int num : nums){
6            max_num = Math.max(max_num, num);
7            min_num = Math.min(min_num, num);
8        }
9
10        return (long) k * (max_num - min_num);
11    }
12}