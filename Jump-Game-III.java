1class Solution {
2    public boolean canReach(int[] arr, int start) {
3        Queue <Integer> q = new LinkedList<>();
4        boolean[] vis = new boolean[arr.length];
5
6        q.offer(start);
7        vis[start] = true;
8
9        while (q.isEmpty() == false){
10            int node = q.poll();
11
12            if (arr[node] == 0)
13            return true;
14
15            int next_ind = node + arr[node];
16            int prev_ind = node - arr[node];
17
18            if (next_ind < arr.length && vis[next_ind] == false){
19                vis[next_ind] = true;
20                q.offer(next_ind);
21            }
22
23            if (prev_ind >= 0 && vis[prev_ind] == false){
24                vis[prev_ind] = true;
25                q.offer(prev_ind);
26            }
27        }
28
29        return false;
30    }
31}