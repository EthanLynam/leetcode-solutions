class Solution {
    public int maxArea(int[] height) {

        int left = 0, right = height.length - 1, smaller = 0, currentWater = 0, largestWater = 0;

        while (left < right) {
            if (height[left] >= height[right]) {
                smaller = height[right];
            }

            else {
                smaller = height[left];
            }

            currentWater = (right - left) * smaller;

            if (currentWater > largestWater) {
                largestWater = currentWater;
            }

            if (height[left] < height[right]) {
                left++;
            }

            else {
                right--;
            }
        }

        return largestWater;
        
    }
}