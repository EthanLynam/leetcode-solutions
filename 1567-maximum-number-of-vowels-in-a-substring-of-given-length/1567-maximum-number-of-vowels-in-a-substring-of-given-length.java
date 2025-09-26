class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int count = 0, left = 1;

        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }

        int max = count;

        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }

            if (vowels.contains(s.charAt(left - 1))) {
                count--;
            }

            if (count > max) {
                max = count;
            }

            left++;
        }
        return max;
    }
}