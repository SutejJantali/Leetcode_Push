1class Solution {
2    public int findMin(int[] nums) {
3        int left = 0, right = nums.length-1;
4
5        while (left < right){
6            int mid = left + (right - left)/2;
7
8            if (nums[mid] > nums[right])
9            left = mid + 1;
10            else if (nums[mid] < nums[right])
11            right = mid;
12            else
13            right -= 1;
14        }
15
16        return nums[left];
17    }
18}
19
20// solution: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/solutions/7709449/intuitive-binary-search-step-by-step-log-24ye