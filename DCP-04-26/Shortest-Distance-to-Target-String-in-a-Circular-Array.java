1class Solution {
2    public int closestTarget(String[] words, String target, int startIndex) {
3        int res = words.length;
4        for (int i = 0; i < words.length; i++){
5            if (words[i].equals(target)){
6                int dis = Math.abs(i - startIndex);
7                System.out.println(dis);
8                System.out.println(words.length - dis);
9                res = Math.min(res, Math.min(dis, words.length - dis));
10            }
11        }
12        if (res == words.length)
13        return -1;
14
15        return res;
16    }
17}