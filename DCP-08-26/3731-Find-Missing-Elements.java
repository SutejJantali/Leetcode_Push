class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        int start = nums[0]-1;
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if (start + 1 == nums[i]){
                start += 1;
                continue;
            }
            else{
                while (start + 1 != nums[i]){
                    res.add(start+1);
                    start += 1;
                }
                start += 1;
            }
        }

        return res;
    }
}