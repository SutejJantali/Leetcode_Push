1class NumArray {
2    int[] prefix;
3    public NumArray(int[] nums) {
4        prefix = new int[nums.length+1];
5
6        for (int i = 1; i <= nums.length; i++){
7            prefix[i] = prefix[i-1] + nums[i-1];
8        }
9    }
10    
11    public int sumRange(int left, int right) {
12        if (left == 0)
13        return prefix[right+1];
14
15        return (prefix[right+1] - prefix[left]);
16    }
17}
18
19/**
20 * Your NumArray object will be instantiated and called as such:
21 * NumArray obj = new NumArray(nums);
22 * int param_1 = obj.sumRange(left,right);
23 */