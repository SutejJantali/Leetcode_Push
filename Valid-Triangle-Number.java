1class Solution {
2    public int binarysearch(int[] nums, int l, int r, int x){
3        // find the position which is nearest previous number to searching number
4        while (r >= l && r < nums.length){
5            int mid = (l + r)/2;
6            if (nums[mid] >= x){
7                r = mid-1;
8            }
9            else
10            l = mid + 1;
11        }
12
13        return l;
14    }
15    public int triangleNumber(int[] nums) {
16        int res = 0;
17        Arrays.sort(nums);
18
19        for (int i = 0; i < nums.length-2; i++){
20            int k = i + 2;
21            for (int j = i + 1; j < nums.length - 1 && nums[i] != 0; j++){
22                k = binarysearch(nums, k, nums.length-1, nums[i] + nums[j]);
23                res += k - j - 1;
24            }
25        }
26
27        return res;
28    }
29}