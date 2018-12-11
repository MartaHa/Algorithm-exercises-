import java.util.stream.IntStream;

/**
 * Complete the method which accepts an array of integers, and returns one of the following:
 * <p>
 * "yes, ascending" - if the numbers in the array are sorted in an ascending order
 * "yes, descending" - if the numbers in the array are sorted in a descending order
 * "no" - otherwise
 * <p>
 * You can assume the array will always be valid, and there will always be one correct answer.
 */
public class Task12 {

    public static String isSortedAndHow(int[] array) {

        String result;

        boolean isAsc = false;
        boolean isDesc = false;

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] <= array[i]) {
                isAsc = true;
            } else {
                isAsc = false;
                break;
            }
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] >= array[i]) {
                isDesc = true;
            } else {
                isDesc = false;
                break;
            }
        }
        if (isAsc == true) {
            result = "yes, ascending";
        } else if (isDesc == true) {
            result = "yes, descending";
        } else {
            result = "no";
        }
        return result;
    }

    //Java Streams version

    public static String isSortedAndHow2version(int[] array) {

        if (IntStream.range(0, array.length - 1).allMatch(i -> array[i] <= array[i + 1]))
            return "yes, ascending";

        if (IntStream.range(0, array.length - 1).allMatch(i -> array[i] >= array[i + 1]))
            return "yes, descending";
        return "no";
    }

    //some tests
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {6, 5, 4, 3, 2, 1};
        int[] array3 = {4, 2, 30};
        int[] array4 = {1, 2, 6, 3, 5, 21, 1};
        System.out.println(isSortedAndHow(array1));
        System.out.println(isSortedAndHow(array2));
        System.out.println(isSortedAndHow(array3));
        System.out.println(isSortedAndHow(array4));
    }
}

