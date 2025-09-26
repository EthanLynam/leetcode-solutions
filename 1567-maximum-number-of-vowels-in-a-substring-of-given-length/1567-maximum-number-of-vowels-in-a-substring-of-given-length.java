class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int count = 0, left = 1;

        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }

        System.out.println(count);

        int max = count;
        int counter = 0;

        for (int i = k; i < s.length(); i++) {
            System.out.println("round" + counter);
            if (vowels.contains(s.charAt(i))) {
                count++;
                System.out.println("plus");
            }

            if (vowels.contains(s.charAt(left - 1))) {
                count--;
                System.out.println("minus");
            }

            if (count > max) {
                max = count;
            }

            left++;

            System.out.println(count);
            counter++;
        }
        return max;
    }
}