class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // Create HashMap
        HashMap <Integer, Integer> numToRank = new HashMap<>();

        // Create Set and add all elements to set
        TreeSet <Integer> nums = new TreeSet<>();
        for (int num : arr){
            nums.add(num);
        }

        int rank = 1;
        // Map set items with rank to HashMap
        for (int num: nums){
            numToRank.put(num, rank);
            rank += 1;
        }
        int[] res = new int[arr.length];

        //Get rank based on element in HashMap
        for (int i = 0; i < arr.length; i++){
            res[i] = numToRank.get(arr[i]);
        }
        
        return res;
    }
}