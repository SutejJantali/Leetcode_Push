1class Solution {
2    public int largestSumAfterKNegations(int[] nums, int k) {
3        Arrays.sort(nums);
4        int res = 0;
5        
6        for (int i = 0; i < nums.length && k > 0; i++){
7            if (nums[i] < 0){
8                nums[i] *= -1;
9                k -= 1;
10            }
11        }
12
13        if (k % 2 == 1){
14            Arrays.sort(nums);
15            nums[0] *= -1;
16        }
17
18        for (int num : nums)
19        res += num;
20
21        return res;
22    }
23}