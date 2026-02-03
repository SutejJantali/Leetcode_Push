1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int i = 0, j = nums.length-1;
4        if (j == 0){
5            return nums;
6        }
7        while (i < j){
8            while (i < j && nums[i] % 2 == 0){
9                i+=1;
10            }
11            while (i < j && nums[j] % 2 == 1){
12                j -=1;
13            }
14            if (nums[i] % 2 == 1 && nums[j] % 2 == 0){
15                int temp = nums[i];
16                nums[i] = nums[j];
17                nums[j] = temp;
18                i += 1;
19                j -= 1;
20            }
21        }
22        return nums;
23    }
24}