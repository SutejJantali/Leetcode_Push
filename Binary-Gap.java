1class Solution {
2    public int binaryGap(int n) {
3        int res = -1, count = 0, first_count = -1;
4        StringBuilder bin_res = new StringBuilder();
5
6        while (n > 0){
7            bin_res.append(n % 2);
8            n /= 2;
9        }
10        System.out.println(bin_res);
11        for (int i = 0; i < bin_res.length(); i++){
12            if (bin_res.charAt(i) == '1' && first_count == -1){
13                first_count = i;
14            }
15            else if (bin_res.charAt(i) == '1'){
16                res = Math.max(res, i - first_count);
17                first_count = i;
18            }
19        }
20        if (res == -1)
21        return 0;
22
23        return res;
24    }
25}