class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        char[] chars = s.toCharArray();
        char temp = 'a';

        int left = 0, right = s.length() - 1;

        while (left < right) {

            while ((!vowels.contains(chars[left])) && (left != right)) {
                left++;
            }

            while ((!vowels.contains(chars[right])) && (left != right)) {
                right--;
            }

            temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        String result = new String(chars);

        return result;
    }
}