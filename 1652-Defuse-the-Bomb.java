class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] new_code = new int[2*code.length];

        if (k == 0){
            for (int i = 0; i < code.length; i++){
                code[i] = 0;
            }

            return code;
        }

        for (int i = 0; i < new_code.length; i++){
            new_code[i] = code[i%code.length];
        }
        int[] res = new int[code.length];
        if (k > 0){
            int start = 0;
            for (int i = start; i < start + code.length; i++){
                int temp_sum = 0;
                for (int j = i + 1; j < i + k + 1; j++){
                    temp_sum += new_code[j];
                }
                res[i-start] = temp_sum;
            }
        }
        else{
            int start = code.length;
            for (int i = start; i < start + code.length; i++){
                int temp_sum = 0;
                for (int j = i - Math.abs(k); j < i; j++){
                    temp_sum += new_code[j];
                }

                res[i-start] = temp_sum;
            }
        }
        
        return res;
    }
}