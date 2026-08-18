class Solution {
    public int largestInteger(int[] nums, int k) {
        int res = -1;

        if (k == nums.length){
            for (int i = 0; i < k; i++){
                res = Math.max(res, nums[i]);
            }

            return res;
        }
        Map <Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i <= nums.length - k; i++){
            for (int j = i; j < i + k; j++){
                mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if (entry.getValue() == 1){
                res = Math.max(res, entry.getKey());
            }
        }

        return res;
    }
}
/*
Sort map with values
import java.util.*;

public class SortMapClassic {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 95);
        map.put("Networking", 80);
        map.put("Data Structure", 85);

        // Convert Map entries to a List
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort the list by entry values using a Lambda Expression
        list.sort((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));

        // Copy the sorted list entries back into a LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Sorted Map: " + sortedMap);
    }
}
*/