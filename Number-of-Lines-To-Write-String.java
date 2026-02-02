1class Solution {
2    public int[] numberOfLines(int[] widths, String s) {
3        int lines = 1, width = 0;
4
5        for (char c : s.toCharArray()){
6            int w = widths[c-'a'];
7            width += w;
8
9            if (width > 100){
10                lines+=1;
11                width = w;
12            }
13        }
14
15        return new int[]{lines, width};
16    }
17}