package Questions;

import java.util.ArrayList;
import java.util.List;


public class FindElementsListWithTargetsum {

    public static void main(String[] args) {
        int array[] = { 1,0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> resultList = new ArrayList<>();
        findFourSum(array, target, 0, new ArrayList<>(), resultList);
        System.out.println(resultList);
    }

    public static void findFourSum(int[] array, int target, int start, List<Integer> list, List<List<Integer>> resultList) {
        if (list.size() == 4) {
            int sum = 0;

            for(int i=0;i<list.size();i++){
                sum+= list.get(i);
            }

            if (sum == target) {
                resultList.add(new ArrayList<>(list));
            }
            return;
        }

        if (start >= array.length) {
            return;
        }

        for (int i = start; i < array.length; i++) {
            list.add(array[i]);
            findFourSum(array, target, i + 1, list, resultList);
            list.remove(list.size() - 1);
        }
    }
}

