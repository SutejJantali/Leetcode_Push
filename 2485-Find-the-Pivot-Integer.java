class Solution {
    public int pivotInteger(int n) {
        int sumLeft = 1, sumRight = n;
        int i = 1, j = n;
        while (i < j){
            if (sumLeft < sumRight){
                i += 1;
                sumLeft += i;
            }else{
                j -= 1;
                sumRight += j;
            }
        }

        return sumLeft == sumRight ? i : -1;
    }
}