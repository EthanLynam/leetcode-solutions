class Solution {
    public boolean isSubsequence(String s, String t) {
        int s_point = 0;

        if (s.isEmpty()) {
            return true;
        }

        for (int t_point = 0; t_point < t.length(); t_point++) {
            if (s.charAt(s_point) == t.charAt(t_point)) {
                s_point++;

                if (s_point == s.length()) {
                    return true;
                }
            }
        }
        return false;    
    }
}