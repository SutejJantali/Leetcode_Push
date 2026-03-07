1class Solution {
2    public boolean checkOnesSegment(String s) {
3        if (s.length() == 1){
4            if (s.charAt(0) == '1')
5            return true;
6
7            return false;
8        }
9
10        for (int i = 1; i < s.length(); i++){
11            if (s.charAt(i-1) == '0' && s.charAt(i) == '1')
12            return false;
13        }
14
15        return true;
16    }
17}