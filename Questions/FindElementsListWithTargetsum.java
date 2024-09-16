package Questions;

import java.util.ArrayList;
import java.util.List;


public class FindElementsListWithTargetsum {

    public static void main(String[] args) {
        int array[] = { 1,0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> result = new ArrayList<>();
        findFourSum(array, target, 0, new ArrayList<>(), result);
        System.out.println(result);
    }

    public static void findFourSum(int[] array, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == 4) {
            int sum = current.stream().mapToInt(Integer::intValue).sum();
            if (sum == target) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        if (start >= array.length) {
            return;
        }

        for (int i = start; i < array.length; i++) {
            current.add(array[i]);
            findFourSum(array, target, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}

