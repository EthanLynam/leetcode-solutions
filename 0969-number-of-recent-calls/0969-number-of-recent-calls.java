class RecentCounter {
    Queue<Integer> nums = new LinkedList<>();

    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        int count = 0;

        nums.add(t);
        
        for (int num : nums) {
            if (num >= (t - 3000)) {
                count++;
            }
        }

        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */