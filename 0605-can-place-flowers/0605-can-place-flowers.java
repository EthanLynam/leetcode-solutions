class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int counter = 0;

        for (int i = 0; i < flowerbed.length; i++) {


            if ((i == 0 || flowerbed[i - 1] == 0) && 
            flowerbed[i] == 0 && 
            (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
    
                flowerbed[i] = 1;
                counter++;
            }

            if (counter >= n) {
                return true;
            }
        }
        return false;
    }
}