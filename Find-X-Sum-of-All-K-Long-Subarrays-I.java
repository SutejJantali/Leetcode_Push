1class Solution {
2    public int[] findXSum(int[] nums, int k, int x) {
3        int[] res = new int[nums.length - k + 1];
4
5        for (int i = 0; i < nums.length - k + 1; i++){
6            Map <Integer, Integer> mp = new HashMap<>();
7            for (int j = i; j < i + k; j++){
8                mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);
9            }
10
11            ArrayList<int[]> freq = new ArrayList<>();
12            for (Map.Entry<Integer, Integer> entry: mp.entrySet()){
13                freq.add(new int[] {entry.getValue(), entry.getKey()});
14            }
15        //b[0] - a[0] → sort by freq DESC
16        //b[1] - a[1] → sort by value DESC
17            freq.sort((a,b) -> b[0] != a[0] ?  b[0]-a[0] : b[1] - a[1]);
18            int xsum = 0;
19            for (int j = 0; j < x && j < freq.size(); j++){
20                xsum += freq.get(j)[0] * freq.get(j)[1];
21            }
22            res[i] = xsum;
23        }
24
25        return res;
26    }
27}