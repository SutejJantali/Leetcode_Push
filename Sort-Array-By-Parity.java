1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int i = 0, j = nums.length-1;
4        while (i < j){
5            while (i < j && nums[i] % 2 == 0){
6                i+=1;
7            }
8            while (i < j && nums[j] % 2 == 1){
9                j -=1;
10            }
11            if (nums[i] % 2 == 1 && nums[j] % 2 == 0){
12                int temp = nums[i];
13                nums[i] = nums[j];
14                nums[j] = temp;
15                i += 1;
16                j -= 1;
17            }
18        }
19        return nums;
20    }
21}