1class Solution {
2    public int countBinarySubstrings(String s) {
3        ArrayList<Integer> groups = new ArrayList<>();
4        groups.add(1);
5        int t = 0;
6        for (int i = 1; i < s.length(); i++){
7            if (s.charAt(i-1) != s.charAt(i)){
8                groups.add(1);
9                t += 1;
10            }
11            else{
12                groups.set(t, groups.get(t)+1);
13            }
14        }
15
16        int res = 0;
17        for (int i = 1; i < groups.size(); i++){
18            res += Math.min(groups.get(i-1), groups.get(i));
19        }
20
21        return res;
22    }
23}