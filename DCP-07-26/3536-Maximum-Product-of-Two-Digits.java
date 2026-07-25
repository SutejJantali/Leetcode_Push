class Solution {
    public int maxProduct(int n) {
        int first_max = 0, sec_max = 0;
        // ArrayList<Integer> res = new ArrayList<>();
        while (n > 0){
            if (n%10 > first_max){
                sec_max = first_max;
                first_max = n%10;
            }
            else if (n%10 > sec_max)
            sec_max = n%10;
            // res.add(n%10);
            n /= 10;
        }

        // Collections.sort(res);

        // return res.get(res.size()-1)*res.get(res.size()-2);
        return first_max*sec_max;
    }
}