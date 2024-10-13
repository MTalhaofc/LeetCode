class Solution {
    public int shipWithinDays(int[] nums, int days) {
        int capacity = maxweight(nums);  // Start with the heaviest item as the minimum capacity
        int daysCounter = 1;  // Start with at least 1 day
        int currentWeight = 0;  // Track the current total weight for a single day

        for (int i = 0; i < nums.length; i++) {
            // If adding the next item exceeds the capacity, ship it the next day
            if (currentWeight + nums[i] > capacity) {
                daysCounter++;  // Start a new day
                currentWeight = 0;  // Reset the current weight for the new day

                // If we've exceeded the allowed number of days, increment capacity
                if (daysCounter > days) {
                    capacity++;  // Increase the capacity to try again
                    daysCounter = 1;  // Reset the day counter
                    currentWeight = 0;  // Reset weight tracking
                    i = -1;  // Restart the loop
                }
            }
            // Add the item to the current day's shipment
            currentWeight += nums[i];
        }

        return capacity;  // Return the final valid capacity
    }

    public int maxweight(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
