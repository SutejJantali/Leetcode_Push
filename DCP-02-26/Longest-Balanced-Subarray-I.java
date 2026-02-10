1class Solution {
2    public int longestBalanced(int[] nums) {
3        int res = 0;
4        for (int i = 0; i < nums.length; i++){
5            HashSet <Integer> odd = new HashSet<>();
6            HashSet <Integer> even = new HashSet<>();
7
8            for (int j = i; j < nums.length; j++){
9                if ((nums[j] & 1) == 0){
10                    even.add(nums[j]);
11                }
12                else odd.add(nums[j]);
13
14                if (odd.size() == even.size())
15                res = Math.max(res, j - i + 1);
16            }
17        }
18
19        return res;
20    }
21}