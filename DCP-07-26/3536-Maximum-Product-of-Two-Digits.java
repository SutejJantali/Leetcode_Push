class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        while (n > 0){
            res.add(n%10);
            n /= 10;
        }

        Collections.sort(res);

        return res.get(res.size()-1)*res.get(res.size()-2);
    }
}