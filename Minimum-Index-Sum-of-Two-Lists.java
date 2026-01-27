1class Solution {
2    public String[] findRestaurant(String[] list1, String[] list2) {
3        ArrayList<String> res = new ArrayList<>();
4        int min_idx = Integer.MAX_VALUE;
5        for (int i = 0; i < list1.length; i++){
6            for (int j = 0; j < list2.length; j++){
7                if (list1[i].equals(list2[j])){
8                    if (i + j < min_idx){
9                    res.clear();
10                    min_idx = i+j;
11                    res.add(list1[i]); 
12                    }
13                    else if (i+j == min_idx){
14                        res.add(list1[i]);
15                        min_idx = i+j;
16                    }
17                }
18            }
19       }
20
21       return res.toArray(new String[0]);
22    }
23}