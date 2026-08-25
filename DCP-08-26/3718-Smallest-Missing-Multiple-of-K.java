class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        boolean found = true;
        while (found == true){
            i += 1;
            int num = k*i;
            found = Arrays.stream(nums).anyMatch(x -> x == num);
        }

        return i*k;
    }
}