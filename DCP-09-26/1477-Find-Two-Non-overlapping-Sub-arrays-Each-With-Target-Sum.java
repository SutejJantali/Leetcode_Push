class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int min_len1 = Integer.MAX_VALUE, min_len2 = Integer.MAX_VALUE;
        int left = 0;
        int curr = 0;
        int result = Integer.MAX_VALUE;
        int[] minLens = new int[arr.length];
        Arrays.fill(minLens, Integer.MAX_VALUE);
        int currentMinLen = Integer.MAX_VALUE;


        for (int right = 0; right < arr.length; right++){
            curr += arr[right];

            while (left <= right && curr > target){
                    curr -= arr[left];
                    left += 1;
            }

            // Found a valid subarray matching target
            if (curr == target) {
                int currentLen = right - left + 1;
                
                // If there is a valid, non-overlapping subarray before 'left'
                if (left > 0 && minLens[left - 1] != Integer.MAX_VALUE) {
                    result = Math.min(result, currentLen + minLens[left - 1]);
                }
                
                // Update the best length found up to the current right pointer
                currentMinLen = Math.min(currentMinLen, currentLen);
            }

            // Maintain the running minimum length for prefix historical data
            minLens[right] = currentMinLen;
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}