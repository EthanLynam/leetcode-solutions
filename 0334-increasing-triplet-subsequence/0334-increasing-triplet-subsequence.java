class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;

        for (int current : nums) {
            if (current <= i) {
                i = current;
            }
            

            else if (current <= j) {
                j = current;
            }

            else {
                return true;
            }
        } 
        return false;
    }
}