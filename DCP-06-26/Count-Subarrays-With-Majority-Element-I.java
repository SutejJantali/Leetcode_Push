1class Solution {
2    public int countMajoritySubarrays(int[] nums, int target) {
3        int n = nums.length, res = 0;
4
5        for (int l = 0; l < n; l++){
6            int targetCount = 0;
7
8            for (int r = l; r < n; r++){
9                if (nums[r] == target){
10                    targetCount += 1;
11                }
12
13                int len = r - l + 1; // window size
14
15                if (targetCount > len / 2) // if any element appears more than half times as of arrays size its majority element
16                res += 1;
17            }
18        }
19
20        return res;
21    }
22}