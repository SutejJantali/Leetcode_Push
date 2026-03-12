1class Solution {
2    public int trap(int[] height) {
3        int res = 0;
4        int[] leftmax = new int[height.length];
5        leftmax[0] = height[0];
6        for (int i = 1; i < height.length; i++){
7            leftmax[i] = Math.max(leftmax[i-1], height[i]);
8        }
9
10        int[] rightmax = new int[height.length+1];
11        rightmax[height.length-1] = height[height.length-1];
12
13        for (int i = height.length-2; i > -1; i--){
14            rightmax[i] = Math.max(rightmax[i+1], height[i]);
15        }
16
17        for (int i = 0; i < height.length; i++){
18            res += Math.min(leftmax[i], rightmax[i]) - height[i];
19        }
20
21        return res;
22    }
23}