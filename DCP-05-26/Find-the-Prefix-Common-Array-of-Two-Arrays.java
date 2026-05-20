1class Solution {
2    public int[] findThePrefixCommonArray(int[] A, int[] B) {
3        int n = A.length;
4        int[] res = new int[n];
5
6        Set <Integer> eleforA = new HashSet<>();
7        Set <Integer> eleforB = new HashSet<>();
8
9        for (int i = 0; i < A.length; i++){
10            eleforA.add(A[i]);
11            eleforB.add(B[i]);
12
13            int comm_cnt = 0;
14
15            for (int ele : eleforA){
16                if (eleforB.contains(ele)){
17                    comm_cnt += 1;
18                }
19            }
20
21            res[i] = comm_cnt;
22        }
23
24        return res;
25    }
26}