import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * There is an array with some numbers. All numbers are equal except for one. Try to find it!
 * <p>
 * Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
 * Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
 * <p>
 * It’s guaranteed that array contains more than 3 numbers.
 * <p>
 * The tests contain some very huge arrays, so think about performance.
 * <p>
 * This is the first kata in series:
 * <p>
 * Find the unique number (this kata)
 * Find the unique string
 * Find The Unique
 */
public class Task13 {

    //using a Hashmap and counting the ocurrencies of each double
    public static double findUniq(double arr[]) {
        double uniq = 0.00;
        Map<Double, Integer> doubleOccurrences = new HashMap();

        for (double d : arr) {
            doubleOccurrences.merge(d, 1, Integer::sum);
        }
        for (Map.Entry<Double, Integer> values : doubleOccurrences.entrySet()) {
            if (values.getValue() == 1) {
                uniq = values.getKey();
            }
        }

        return uniq;
    }

    //Java Streams methods
    public static double findUniq2 (double arr[]){
        return  Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue() == 1).findFirst().get().getKey();
    }

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
        System.out.println(findUniq2(new double[]{1,1,1,2,1,1,1,1,1}));
    }
}
