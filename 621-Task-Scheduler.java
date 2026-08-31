class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap <Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < tasks.length; i++){
            mp.put(tasks[i] - 'a', mp.getOrDefault(tasks[i]- 'a', 0) + 1);
        }
        
        int max_freq = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()){
            max_freq = Math.max(max_freq, entry.getValue());
        }

        int num_task_with_max_freq = 0;

        for (Map.Entry <Integer, Integer> entry : mp.entrySet()){
            if (max_freq == entry.getValue())
            num_task_with_max_freq += 1;
        }

        return Math.max(tasks.length, (max_freq - 1)*(n+1)+ num_task_with_max_freq);
    }
}