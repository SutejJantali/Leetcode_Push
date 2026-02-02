1class Solution {
2    public boolean isSorted(int[] nums, int n){
3        for (int i = 1; i < n; i++){
4            if (nums[i-1] > nums[i]){
5                return false;
6            }
7        }
8        return true;
9    }
10    public int minimumPairRemoval(int[] nums) {
11        int res = 0, n = nums.length;
12        while (isSorted(nums, n) == false){
13            res += 1;
14            int pos = -1, min_sum = Integer.MAX_VALUE;
15            for (int i = 1; i < n; i++){
16                if (nums[i] + nums[i-1] < min_sum){
17                    min_sum = nums[i] + nums[i-1];
18                    pos = i;
19                }
20            }
21            nums[pos-1] = min_sum;
22            for (int i = pos; i < n-1; i++)
23            nums[i] = nums[i+1];
24            n--;
25        }
26
27        return res;
28    }
29}