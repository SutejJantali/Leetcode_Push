1class Solution {
2    public int calPoints(String[] operations) {
3        ArrayList<Integer> arr = new ArrayList<>();
4        int curr = 0;
5        for (String st: operations){          
6            if (st.equals("D")){
7                curr = arr.get(arr.size()-1)*2;
8                arr.add(curr);
9            }
10            else if(st.equals("C")){
11                arr.remove(arr.size()-1);
12            }
13            else if(st.equals("+")){
14                curr = arr.get(arr.size()-1) + arr.get(arr.size()-2);
15                arr.add(curr);
16            }
17            else{
18                curr = Integer.parseInt(st);
19                arr.add(curr);
20            }
21        }
22        int sum = 0;
23        for (int ele:arr){
24            sum += ele;
25        }
26        return sum;
27    }
28}