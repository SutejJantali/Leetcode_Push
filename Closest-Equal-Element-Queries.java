1class Solution {
2    public List<Integer> solveQueries(int[] nums, int[] queries) {
3        Map <Integer, List <Integer>> map = new HashMap<>();
4        int n = nums.length;
5        for (int i = 0; i < nums.length; i++){
6            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
7        }
8
9        // Now map contains for every distinct value a sorted list of indices
10        // (sorted because we iterate i from 0 to n-1)
11        List <Integer> res = new ArrayList<>();
12        // ----- Step 2: Process each query -----
13        for (int i = 0; i < queries.length; i++) {
14            int queryIndex = queries[i];            // the index we are asking about
15            int targetValue = nums[queryIndex];     // the value at that index
16            List<Integer> indices = map.get(targetValue); // list of all indices with that value
17            
18            // If the value appears only once (the list size is 1) -> no other index -> -1
19            if (indices.size() == 1) {
20                res.add(-1);
21                continue;   // move to the next query
22            }
23            
24            // Find the position of queryIndex inside its own list using binary search
25            int pos = binSearch(indices, queryIndex);
26            int size = indices.size();
27            
28            // Get the immediate neighbours in the list (circular)
29            // (pos-1 + size) % size handles wrap-around for the previous element
30            int prevIndex = indices.get((pos - 1 + size) % size);
31            int nextIndex = indices.get((pos + 1) % size);
32            
33            // Circular distance from queryIndex to prevIndex
34            int distPrev = Math.min(Math.abs(queryIndex - prevIndex),
35                                    n - Math.abs(queryIndex - prevIndex));
36            // Circular distance from queryIndex to nextIndex
37            int distNext = Math.min(Math.abs(queryIndex - nextIndex),
38                                    n - Math.abs(queryIndex - nextIndex));
39            
40            // The answer is the smaller of the two distances
41            res.add(Math.min(distPrev, distNext));
42        }
43        
44        return res;
45    }
46
47        // ----- Standard binary search on a sorted list -----
48    // Returns the index (position) where 'target' is found, or -1 if not present
49    private int binSearch(List<Integer> list, int target) {
50        int left = 0, right = list.size() - 1;
51        while (left <= right) {
52            int mid = left + (right - left) / 2;
53            int midVal = list.get(mid);
54            if (midVal == target) {
55                return mid;          // found exact position
56            } else if (midVal < target) {
57                left = mid + 1;
58            } else {
59                right = mid - 1;
60            }
61        }
62        return -1;   // should never happen for valid queries, but kept for safety
63    }
64}