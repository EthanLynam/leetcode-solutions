class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
    
            if (map.containsKey(arr[i])) {
                int og = map.get(arr[i]) + 1;
                map.put(arr[i], og);
                continue;
            }

            map.put(arr[i], 1);
        }

        for (int i : map.values()) {
            if (!set.add(i)) {
                return false;
            }
        }

        return true;  
    }
}