class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0, position = s.length() - 1;

        while (position >= 0) {
            while (position >= 0 && s.charAt(position) != ' ') {
                count++;
                position--;
            }
            

            if (count != 0) {
                int j = position + 1;
                for (int i = 0; i < count; i++) {
                    sb.append(s.charAt(j));
                    j++;
                }
                sb.append(' ');
                count = 0;
            }

            position--;
        }

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}