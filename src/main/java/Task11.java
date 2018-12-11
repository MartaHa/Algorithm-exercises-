import java.util.*;

/**
 * IN PROGRESS
 * Modify the order of the list". It was decided to attribute a "weight" to numbers.
 * The weight of a number will be from now on the sum of its digits.
 * <p>
 * For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99.
 * Given a string with the weights of FFC members in normal order can you give this string ordered by "weights"
 * of these numbers?
 * Example:
 * <p>
 * "56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes: "100 180 90 56 65 74 68 86 99"
 * When two numbers have the same "weight", let us class them as if they were strings and not numbers:
 * 100 is before 180 because its "weight" (1) is less than the one of 180 (9) and 180 is before 90 since, having the same "weight" (9)
 * it comes before as a string.
 * All numbers in the list are positive numbers and the list can be empty.
 * There may be more than one whitespace in String between the numbers.
 */

public class Task11 {

    public static String orderWeight(String strng) {
        String result = "";

        if (strng == null || strng.isEmpty()) {
            result = "There are no numbers in this String";
        } else {

            //removing whitespaces;
            String trimmedNumbers = strng.replaceAll("( )+", "$1");
            System.out.println(trimmedNumbers);

            String[] stringsNumbers = trimmedNumbers.split(" ");
            System.out.println(Arrays.toString(stringsNumbers));

            Map numbersWithWeights = new TreeMap();


            for (String stringNumber : stringsNumbers) {
                String[] digits = stringNumber.split("");
                int number = 0;
                for (int i = 0; i < digits.length; i++) {
                    number += Integer.parseInt(digits[i]);
                }
                numbersWithWeights.put(Integer.toString(number), stringNumber);
            }

            Collection values = numbersWithWeights.values();
            Iterator iterator = values.iterator();
            while (iterator.hasNext()) {
                result += iterator.next() + " ";

            }
        }


        return result;
    }


    public static void main(String[] args) {
        String toCheck = "56 65 74     100   99 68 86 180   90";
        System.out.println(orderWeight(toCheck));
    }
}