package Questions;/*
A conveyor belt has packages that must be shipped from one port to another within days days.

The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.



Example 1:

Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
Output: 15
Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
        1st day: 1, 2, 3, 4, 5
        2nd day: 6, 7
        3rd day: 8
        4th day: 9
        5th day: 10

Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.
        Example 2:

Input: weights = [3,2,2,4,1,4], days = 3
Output: 6
Explanation: A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:
        1st day: 3, 2
        2nd day: 2, 4
        3rd day: 1, 4
Example 3:

Input: weights = [1,2,3,1,1], days = 4
Output: 3
Explanation:
        1st day: 1
        2nd day: 2
        3rd day: 3
        4th day: 1, 1


Constraints:

        1 <= days <= weights.length <= 5 * 104
        1 <= weights[i] <= 500
*/

class CapacityToShipPackagesWithinDDays {
    public static int shipWithinDays(int[] weights, int days) {
        // Step 1: Determine the search range
        int left = 0; // Minimum possible capacity (the heaviest package)
        int right = 0; // Maximum possible capacity (sum of all package weights)

        for (int weight : weights) {
            left = Math.max(left, weight); // The minimum capacity must be at least the maximum weight
            right += weight; // The maximum capacity is the sum of all weights
        }

        // Step 2: Perform binary search to find the minimal capacity
        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a valid capacity
            if (canShipInDays(weights, days, mid)) {
                right = mid; // Try smaller capacity
            } else {
                left = mid + 1; // Increase the capacity
            }
        }

        // Step 3: Return the minimum capacity found
        return left;
    }

    // Helper function to check if it's possible to ship within the given number of days with the given capacity
    private static boolean canShipInDays(int[] weights, int days, int capacity) {
        int currentLoad = 0;
        int daysNeeded = 1; // Start with the first day

        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                // If adding this package exceeds capacity, we need another day
                daysNeeded++;
                currentLoad = 0; // Start a new day
            }
            currentLoad += weight; // Add the package to the current day's load

            if (daysNeeded > days) {
                // If we need more days than allowed, return false
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int weights[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }
}
