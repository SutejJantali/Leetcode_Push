1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        String test = "abllnoo";
4        StringBuilder temp = new StringBuilder();
5
6        for (int i = 0; i < text.length(); i++){
7            if (test.indexOf(text.charAt(i)) > -1)
8            temp.append(text.charAt(i));
9        }
10        char[] arr = temp.toString().toCharArray();
11        Arrays.sort(arr);
12        StringBuilder remaining = new StringBuilder(new String(arr));
13
14        int res = 0;
15        while (true){
16            boolean found = true;
17
18            for (char c : test.toCharArray()){
19                int idx = remaining.indexOf(String.valueOf(c));
20                if (idx == -1){
21                    found = false;
22                    break;
23                }
24                
25
26                remaining.deleteCharAt(idx);
27            }
28
29            if (!found)
30            break;
31
32            res += 1;
33        }
34
35        return res;
36    }
37}