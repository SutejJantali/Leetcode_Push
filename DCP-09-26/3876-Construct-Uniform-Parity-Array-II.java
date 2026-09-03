class Solution {
    public boolean uniformArray(int[] nums1) {
        int smallest_num = nums1[0];
        boolean hasOddnum = false;

        for (int num : nums1){
            if (num < smallest_num){
                smallest_num = num;
            }

            if ((num & 1) == 1){
                hasOddnum = true;
            }
        }

        if ((smallest_num & 1) == 1){
            return true;
        }

        return !hasOddnum;
    }
}