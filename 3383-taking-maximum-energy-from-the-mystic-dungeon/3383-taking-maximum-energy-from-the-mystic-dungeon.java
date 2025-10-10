class Solution {
    public int maximumEnergy(int[] energy, int k) {

        int max = Integer.MIN_VALUE, current = 0;

        for (int i = 0; i < k; i++) {
            current = 0;
            
            for (int j = i; j < energy.length; j += k) {
                current += energy[j];
            }
            
            for (int j = i; j < energy.length; j+=k) {

                if (current > max) {
                    max = current;
                }

                current -= energy[j];
            }
        }

        return max;
        
    }
}