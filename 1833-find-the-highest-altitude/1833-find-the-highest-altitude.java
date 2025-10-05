class Solution {
    public int largestAltitude(int[] gain) {

        int total = 0, max = 0;

        for (int i = 0; i < gain.length; i++) {
            total += gain[i];
            
            if (total > max) {
                max = total;
            }
        }

        return max;
    }
}