1class Solution {
2    public int maxRotateFunction(int[] nums) {
3        long sum_all_ele = 0, f = 0;
4
5        for (int i = 0; i < nums.length; i++){
6            sum_all_ele += nums[i];
7            f += (long)i * nums[i];
8        }
9
10        long res = f;
11
12        for (int k = 1; k < nums.length; k++){
13            f = f + sum_all_ele - (long) nums.length * nums[nums.length - k];
14            res = Math.max(res, f);
15        }
16
17        return (int)res;
18    }
19}
20
21//https://leetcode.com/problems/rotate-function/solutions/8120458/beats-100-dynamic-programming-math-brute-de0d