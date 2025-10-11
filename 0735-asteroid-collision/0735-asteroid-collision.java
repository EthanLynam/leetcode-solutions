class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        Boolean destroy = true;

        for (int i = 0; i < asteroids.length; i++) {
            destroy = false;
            
            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
                continue;
            }

            if (stack.isEmpty() || stack.peek() < 0) {
                stack.push(asteroids[i]);
                continue;
            }

            while (!stack.isEmpty() && stack.peek() > 0) {
                if (stack.peek() > Math.abs(asteroids[i])) {
                    destroy = true;
                    break;
                }

                else if (stack.peek() == Math.abs(asteroids[i])) {
                    destroy = true;
                    stack.pop();
                    break;
                }

                stack.pop();
            }

            if (destroy == true) {
                continue;
            }

            stack.push(asteroids[i]);
        }

        int[] output = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            output[i] = stack.get(i);
        }

        return output;
    }
}