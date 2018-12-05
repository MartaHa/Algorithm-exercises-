import java.util.Arrays;

/**
 * In this little assignment you are given
 * a string of space separated numbers, and have to return the highest and lowest number.
 * All numbers are valid Int32, no need to validate them.
 * There will always be at least one number in the input string.
 * Output string must be two numbers separated by a single space, and highest number is first.
 *
 */

public class Task7 {

    public static String HighAndLow(String numbers) {

        String[] strArray = numbers.split(" ");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        int min = intArray[0];
        int max = intArray[0];

        //max
        for(int i=1;i < intArray.length;i++){
            if(intArray[i] > max){
                max = intArray[i];
            }
        }
        //min
        for(int i=1;i < intArray.length;i++){
            if(intArray[i] < min){
                min = intArray[i];
            }
        }
        String result = max + " " + min;
        return result;
        }


        public static void main (String[]args){
            String numbers = "3 56 7 87 9 1";
            System.out.println(HighAndLow(numbers));
        }

//Java 8 version

    public static String HighAndLow2(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return String.format("%d %d", max, min);
    }
}
