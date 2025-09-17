class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char current = ' ';

        for (int i = 0; i < chars.length; i++) {
            current = chars[i];
            sb.append(current);

            while (i + 1 < chars.length && current == chars[i + 1]) {
                count++;
                i++;
            }

            if (count > 1) {
                sb.append(count);
                count = 1;
            }
        }

        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}