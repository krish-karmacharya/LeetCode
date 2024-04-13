import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complement of each element
        HashMap<Integer, Integer> complementMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check if the complement exists in the HashMap
            if (complementMap.containsKey(complement)) {
                // Return the indices of the two elements
                return new int[] { complementMap.get(complement), i };
            }
            // Store the current element and its index in the HashMap
            complementMap.put(nums[i], i);
        }

        // No solution found
        return new int[] {};
    }
}