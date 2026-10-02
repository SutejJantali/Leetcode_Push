class Solution {
    List <String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if (n == 0)
        return res;

        f(0, 0, n, "");
        return res;
    }

    public void f(int left, int right, int n, String s){
        if (s.length() == n*2){
            res.add(s);
            return;
        }

        if (left < n)
        f(left + 1, right, n, s + '(');

        if (right < left)
        f(left, right + 1, n, s + ')');
    }
}