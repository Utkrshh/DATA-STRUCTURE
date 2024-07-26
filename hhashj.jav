import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Vector<Integer> v = new Vector<>();
        Stack<Integer> s = new Stack<>();
        
        int n = nums.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (s.isEmpty()) {
                v.add(-1);
            } else if (!s.isEmpty() && s.peek() > nums[i]) {
                v.add(s.peek());
            } else if (!s.isEmpty() && s.peek() <= nums[i]) {
                while (!s.isEmpty() && s.peek() <= nums[i]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    v.add(-1);
                } else {
                    v.add(s.peek());
                }
            }
            s.push(nums[i]);
        }
        
        // Reverse the vector to maintain the original order
        Collections.reverse(v);
        
        // Convert Vector to int[] array
        int[] result = new int[v.size()];
        for (int i = 0; i < v.size(); i++) {
            result[i] = v.get(i);
        }
        
        return result;
    }
}
