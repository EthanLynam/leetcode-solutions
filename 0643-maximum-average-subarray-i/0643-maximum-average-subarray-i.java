class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double average = 0, max = 0, current = 0;


        for (int i = 0; i < k; i++) {
            average += nums[i];
        }

        max = average / k;

        for (int right = k; right < nums.length; right++) {

            average += nums[right];
            average -= nums[right - k];

            current = average / k;
            
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
}