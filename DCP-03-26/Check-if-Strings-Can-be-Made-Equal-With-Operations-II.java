1class Solution {
2    public boolean checkStrings(String s1, String s2) {
3        if (s1.length() != s2.length())
4        return false;
5
6        int[] count1 = new int[256];
7        int[] count2 = new int[256];
8
9        for (int i = 0; i < s1.length(); i++){
10            int offset = (i & 1) << 7;
11            count1[offset + s1.charAt(i)]++;
12            count2[offset + s2.charAt(i)]++;
13        }
14
15        return Arrays.equals(count1, count2);
16    }
17}
18/* explaination
19Let’s say we are comparing two strings: s1 = "abcd" and s2 = "cdab".
20The code needs to know if the characters at even positions (0, 2) in s1 match the characters at even positions in s2, and the same for odd positions (1, 3).
21How it works step-by-step:
22
23   1. Index 0 ('a'): 0 & 1 is 0. Offset = 0.
24   * It stores 'a' at count1[0 + 'a'].
25   2. Index 1 ('b'): 1 & 1 is 1. Offset = 128.
26   * It stores 'b' at count1[128 + 'b'].
27   3. Index 2 ('c'): 2 & 1 is 0. Offset = 0.
28   * It stores 'c' at count1[0 + 'c'].
29   4. Index 3 ('d'): 3 & 1 is 1. Offset = 128.
30   * It stores 'd' at count1[128 + 'd'].
31   
32The Resulting "Map":
33The array count1 now looks like this internally:
34
35* Slots 0–127 (Even): Contains 1 'a' and 1 'c'.
36* Slots 128–255 (Odd): Contains 1 'b' and 1 'd'.
37
38When the code runs Arrays.equals(count1, count2), it is checking if s2 has the exact same characters in its even slots and its odd slots. If you tried to swap an 'a' from an even position to an odd position, the offset would change, the counts wouldn't match, and the function would return false.
39Does it make sense why 128 was chosen as the shift value for the offset?
40
41*/