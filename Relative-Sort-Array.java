1class Solution {
2    public int[] relativeSortArray(int[] arr1, int[] arr2) {
3        ArrayList <Integer> res = new ArrayList<>();
4        
5        for (int i = 0; i < arr2.length; i++){
6            for (int j = 0; j < arr1.length; j++){
7                if (arr1[j] == arr2[i]){
8                    res.add(arr2[i]);
9                    arr1[j] = -1;
10                }
11            }
12        }
13        
14        Arrays.sort(arr1);
15
16        for (int i = 0; i < arr1.length; i++){
17            if (arr1[i] != -1){
18                res.add(arr1[i]);
19            }
20        }
21
22        // Convert ArrayList<Integer> → int[]
23        int[] ans = new int[res.size()];
24        for (int i = 0; i < res.size(); i++) {
25            ans[i] = res.get(i);
26        }
27
28        return ans;
29    }
30}