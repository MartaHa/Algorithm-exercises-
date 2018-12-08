import java.util.*;

/**
 Given a list lst and a number N, create a new list that contains each number of lst at most N times
 without reordering. For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2],
 drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3,
 which leads to [1,2,3,1,2,3].
 */


public class Task9 {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        List result = new ArrayList();

        Map occurenciesMap = new HashMap();

        for (int i = 0; i < elements.length; i++) {
            int currentDigit = elements[i];

            if (occurenciesMap.get(currentDigit) == null) {
                occurenciesMap.put(currentDigit, 1);
                result.add(currentDigit);

            } else {
                int value = (int) occurenciesMap.get(elements[i]);
                if (value < maxOccurrences) {
                    result.add(currentDigit);
                    occurenciesMap.put(currentDigit, value + 1);
                }

            }
        }

        int[] resultArray = new int[result.size()];
        for (
                int i = 0; i < result.size(); i++) {
            resultArray[i] = (int) result.get(i);
        }

        return resultArray;
    }


    public static void main(String[] args) {
        int[] elements0 = {1, 2, 1, 2, 3, 4, 1, 2, 4, 5, 6, 1, 2};
        System.out.println(Arrays.toString(deleteNth(elements0, 2)));

        int[] elements2 = new int[]{20, 37, 21, 20};
        System.out.println(Arrays.toString(Task9.deleteNth(elements2, 1)));
    }
}
