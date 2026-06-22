1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        int[] count = new int[26];
4
5        for (char c : text.toCharArray()) {
6            count[c - 'a']++;
7        }
8
9        return Math.min(
10                Math.min(count['b' - 'a'], count['a' - 'a']),
11                Math.min(
12                    Math.min(count['l' - 'a'] / 2, count['o' - 'a'] / 2),
13                    count['n' - 'a']
14                )
15        );
16    }
17}
18
19/*min(
20    count(b),
21    count(a),
22    count(l)/2,
23    count(o)/2,
24    count(n)
25)
26text = "loonbalxballpoon"
27b = 2
28a = 2
29l = 4
30o = 4
31n = 2
32b -> 2/1 = 2 balloons
33a -> 2/1 = 2 balloons
34l -> 4/2 = 2 balloons
35o -> 4/2 = 2 balloons
36n -> 2/1 = 2 balloons
37
38int b = count['b' - 'a'];
39int a = count['a' - 'a'];
40int l = count['l' - 'a'] / 2;
41int o = count['o' - 'a'] / 2;
42int n = count['n' - 'a'];
43
44return Math.min(
45    Math.min(b, a),
46    Math.min(Math.min(l, o), n)
47);
48*/