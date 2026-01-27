1class Solution {
2    public int countSegments(String s) {
3        if (s.length() == 0)
4        return 0;
5        int res = 0;
6        for (int i = 0; i < s.length(); i++){
7        if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i-1) == ' '))
8        res++;
9        }
10        return res;
11    }
12}