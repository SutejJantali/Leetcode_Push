class Solution {
    public int gcd(int a, int b){
        if (b == 0)
        return a;

        return gcd(b, b % a);
    }
    public int gcdOfOddEvenSums(int n) {
        if (n == 1)
        return 1;
        
        return gcd(n*n, (n*n)+n);
    }
}