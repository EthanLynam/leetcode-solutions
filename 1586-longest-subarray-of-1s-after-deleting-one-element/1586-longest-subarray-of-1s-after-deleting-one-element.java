class Solution {
    public int longestSubarray(int[] nums) {

        int k = 1, right = 0, left = 0, count = 0, max = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                count++;
            }

            while (count > k) {
                if (nums[left] == 0) {
                    count--;
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
            right++;
        }

        return max - 1;
        
    }
}