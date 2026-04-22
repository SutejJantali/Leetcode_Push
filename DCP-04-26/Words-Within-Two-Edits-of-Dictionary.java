1class Solution {
2    boolean hasMatch(String q, String[] dictionary){
3        for (String d : dictionary){
4            int max_diff = 2;
5
6            for (int i = 0; i < q.length(); i++){
7                if (q.charAt(i) != d.charAt(i))
8                max_diff -= 1;
9
10                if (max_diff < 0)
11                break;
12            }
13
14            if (max_diff >= 0)
15            return true;
16        }
17        return false;
18    }
19    public List<String> twoEditWords(String[] queries, String[] dictionary) {
20        List <String> res = new ArrayList<>();
21        for (String q : queries){
22            if (hasMatch(q, dictionary) == true){
23                res.add(q);
24            }
25        }
26
27        return res;
28    }
29}