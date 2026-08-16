class Solution {
    public boolean stoneGameIX(int[] stones) {
        if (stones.length == 1)
        return false;

        int rem_0 = 0, rem_1 = 0, rem_2 = 0;

        for (int i = 0; i < stones.length; i++){
            if (stones[i] % 3 == 0)
            rem_0 += 1;
            else if (stones[i] % 3 == 1)
            rem_1 += 1;
            else rem_2 += 1;
        }

        if (rem_0 % 2 == 0 && rem_1 > 0 && rem_2 > 0)
        return true;

        if (rem_0 % 2 == 1 && Math.abs(rem_1 - rem_2) > 2)
        return true;

        return false;
    }
}
//https://leetcode.com/problems/stone-game-ix/solutions/8463551/stone-game-ix-remainder-counting-game-st-k7ny