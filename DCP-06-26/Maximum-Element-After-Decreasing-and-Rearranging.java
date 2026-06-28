1class Solution {
2    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
3        Arrays.sort(arr);
4        int res = 1;
5        for (int i = 1; i < arr.length; i++){
6            if (arr[i] >= res + 1){
7                res += 1;
8            }
9        }
10
11        return res;
12    }
13}