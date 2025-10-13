class RecentCounter {
    Deque<Integer> nums = new LinkedList<>();
    int count = 0;

    public RecentCounter() {
        
    }
    
    public int ping(int t) {

        nums.addFirst(t);
        count++;

        while (nums.peekLast() < (t - 3000)) {
            nums.removeLast();
            count--;
        }

        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */