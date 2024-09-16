package Questions;

import java.util.ArrayList;
import java.util.List;


public class FindElementsListWithTargetsum {

    public static void main(String[] args) {
        //nums = [1,0,-1,0,-2,2], target = 0 Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
        int array[] = { 1,0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> result = new ArrayList<>();
        findFourSum(array, target, 0, new ArrayList<>(), result);
        System.out.println(result);
    }

    public static void findFourSum(int[] array, int target, int start, List<Integer> current, List<List<Integer>> result) {
        // Base case: if we have 4 numbers and their sum equals the target
        if (current.size() == 4) {
            int sum = current.stream().mapToInt(Integer::intValue).sum();
            if (sum == target) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        // If there are not enough elements left to complete the combination
        if (start >= array.length) {
            return;
        }

        // Recursive case: choose each element and explore further
        for (int i = start; i < array.length; i++) {
            current.add(array[i]);
            findFourSum(array, target, i + 1, current, result);
            current.remove(current.size() - 1); // Backtrack
        }
    }
}

