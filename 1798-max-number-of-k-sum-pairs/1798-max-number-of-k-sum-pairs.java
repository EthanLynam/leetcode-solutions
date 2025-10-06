class Solution {
    public int maxOperations(int[] nums, int k) {

        int count = 0, i = 0, j = nums.length - 1;
        Arrays.sort(nums);

        while (i < j) {
            int sum = nums[i] + nums[j];

            if (sum > k) {
                j--;
            }

            if (sum < k) {
                i++;
            }

            if (sum == k) {
                count++;
                i++;
                j--;
            }
        }
        return count;
    }
}