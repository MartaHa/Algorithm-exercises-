import java.util.*;

/**
 * in progress
 * */



public class Task9 {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        List resultList = new ArrayList();

        for (int j = 0; j < elements.length; j++) {
            int counter = 0;
            int toCheck = elements[j];

            for (int i = 0; i < elements.length; i++) {

                if (elements[i] == toCheck) {
                    counter++;
                }

            }
            if (counter <= maxOccurrences) {
                resultList.add(elements[j]);
            }
        }


        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = (int) resultList.get(i);
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
