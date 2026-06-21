1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        Arrays.sort(costs);
4        int res = 0;
5
6        for (int cost : costs){
7            if (cost > coins)
8            break;
9
10            res += 1;
11            coins -= cost;
12        }
13
14        return res;        
15    }
16}