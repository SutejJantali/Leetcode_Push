1class Solution {
2    public int numberOfSpecialChars(String word) {
3        boolean[] hasLower = new boolean[26];
4        boolean[] hasUpper = new boolean[26];
5        boolean[] isInvalid = new boolean[26]; 
6
7        for (int i = 0; i < word.length(); i++) {
8            char ch = word.charAt(i);
9            
10            if (Character.isLowerCase(ch)) {
11                int index = ch - 'a';
12                hasLower[index] = true;
13
14                if (hasUpper[index] != false) {
15                    isInvalid[index] = true;
16                }
17            } else {
18                int index = ch - 'A';
19                hasUpper[index] = true;
20            }
21        }
22
23        int res = 0;
24        for (int i = 0; i < 26; i++) {
25            if (hasLower[i] && hasUpper[i] && !isInvalid[i]) {
26                res++;
27            }
28        }
29
30        return res;
31    }
32}
33