class Solution {
    public int missingInteger(int[] nums) {
        int total = nums[0];

        Set <Integer> st = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            st.add(nums[i]);
        }

        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i-1] + 1){
                total += nums[i];
            }
            else{
                break;
            }
        }

        for (int i = 0; i < nums.length; i++){
            if(st.contains(total)){
                total += 1;
            }
            else{
                break;
            }
        }
        return total;
    }
}