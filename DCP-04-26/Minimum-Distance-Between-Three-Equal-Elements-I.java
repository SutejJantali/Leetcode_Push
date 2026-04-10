1class Solution {
2    public int minimumDistance(int[] nums) {
3        int res = nums.length + 1;
4
5        for (int i = 0; i < nums.length-2; i++){
6            for (int j = i + 1; j < nums.length-1; j++){
7                if (nums[i] != nums[j])
8                continue;
9
10                for (int k = j + 1; k < nums.length; k++){
11                    if (nums[k] == nums[j]){
12                        res = Math.min(res, (k - i));
13                        break;
14                    }
15                }
16            }
17        }
18
19        return res == nums.length + 1? -1 : res*2;
20    }
21}