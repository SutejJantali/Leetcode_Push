1class Solution {
2    public List<Integer> grayCode(int n) {
3        int size = 1 << n; // 2 ^ n
4        List <Integer> res = new ArrayList<>();
5        for (int i = 0; i < size; i++){
6            res.add(i ^ (i >> 1));
7        }
8        return res;
9    }
10}
11
12// solution : https://leetcode.com/problems/gray-code/solutions/6805603/simplest-logic-evercrazy-explanation-def-ioqm