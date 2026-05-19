1public class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3        int first = 0;
4        int second = 0;
5
6        // Traverse through both arrays with two pointers
7        // Increment the pointer with a smaller value at that index
8        // Return the first common element found
9        while (first < nums1.length && second < nums2.length) {
10            if (nums1[first] < nums2[second]) {
11                first++;
12            } else if (nums1[first] > nums2[second]) {
13                second++;
14            } else {
15                return nums1[first];
16            }
17        }
18
19        // Return -1 if there are no common elements
20        return -1;
21    }
22}