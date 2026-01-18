1class Solution {
2    public int[] shortestToChar(String s, char c) {
3        int i = 0, j = 0;
4        int n = s.length();
5        int[] res = new int[n];
6        int temp_pos = Integer.MAX_VALUE;
7
8        while (j < n){
9            if (s.charAt(j) == c){
10                while (i <= j){
11                res[i] = Math.min(Math.abs(j-i), Math.abs(temp_pos - i));
12                i++;
13                }
14                temp_pos = j;
15            }
16            j++;
17        }
18        while (i < n){
19            res[i] = Math.abs(temp_pos - i);
20            i++;
21        }
22        return res;
23    }
24}