1class Solution {
2    public boolean isLongPressedName(String name, String typed) {
3        int i = 0, n = name.length();
4
5        for (int j = 0; j < typed.length(); j++){
6            if (i < n && name.charAt(i) == typed.charAt(j)){
7                i++;
8            }
9            else if (j == 0 || typed.charAt(j) != typed.charAt(j-1)){
10                return false;
11            }
12        }
13
14        return i == n;
15    }
16}