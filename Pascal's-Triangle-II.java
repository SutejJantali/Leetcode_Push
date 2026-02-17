1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        ArrayList <Integer> row = new ArrayList<>();
4        row.add(1);
5
6        for (int i = 0; i < rowIndex; i++){
7            ArrayList <Integer> newrow = new ArrayList<>();
8            newrow.add(1);
9            for (int j = 1; j < row.size(); j++){
10                newrow.add(row.get(j-1) + row.get(j));
11            }
12            newrow.add(1);
13            row = newrow;
14        }
15
16        return row;
17    }
18}