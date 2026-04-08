1class Solution {
2    public int concatenatedBinary(int n) {
3        final int mod = 1_000_000_007;
4        long res = 0;
5        int bits = 0;
6
7        for (int i = 1; i <= n; i++){
8            if ( (i & (i-1)) == 0)
9            bits += 1;
10
11            res = ((res << bits) | i) % mod;
12        }
13        return (int) res;
14    }
15}
16
17/*why is this line required:
18            res = ((res<<bits) | i) % MOD;
19That line is the core logic that "glues" the next number onto the end of your binary string.
20Think of it like appending digits in base-10. If you have 12 and want to add 3 to the end to get 123, you do:
21
22
23
24
25
26
27In binary, we do the same thing using bit shifting:
28res << bits: This shifts the current number to the left to make "empty seats" for the new number 
29. If 
30 is 3 (which is 11 in binary), bits is 2, so we shift res left by 2 positions.
31| i: This fills those empty seats with the binary bits of 
32. Since the seats are now zeros, using a bitwise OR (or even addition) places 
33 at the end.
34% MOD: This keeps the number from getting so large that it crashes the computer's memory or exceeds the capacity of a long variable.*/