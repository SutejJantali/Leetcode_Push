1class Solution {
2    public List<Integer> selfDividingNumbers(int left, int right) {
3        ArrayList<Integer> res = new ArrayList<>();
4        for (int i = left; i <= right; i++){
5            int num = i;
6            boolean flag = false;
7            while(num > 0){
8                int digit = num%10;
9                if (digit == 0 || i%digit != 0){
10                    flag = true;
11                    break;
12                }
13                num = num/10;
14            }
15            if (flag == false)
16            res.add(i);
17        }
18
19        return res;
20    }
21}