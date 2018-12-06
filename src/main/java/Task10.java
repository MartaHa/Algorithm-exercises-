import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

/**
 * You are given two arrays a1 and a2 of strings.
 * Each string is composed with letters from a to z. Let x be any string in the first array
 * and y be any string in the second array.
 * Find max(abs(length(x) − length(y)))
 * <p>
 * If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).
 */

public class Task10 {

    public static int mxdiflg(String[] a1, String[] a2) {
        if ((a1 == null && a1.length ==0) || (a2 == null && a2.length ==0)) {
            return -1;
        }
        int result = 0;
        int arrayLength = a1.length * a2.length;
        int[] results = new int[arrayLength];


            if (a1.length >= a2.length) {

                int indexCounter = 0;
                for (int i = 0; i < a1.length; i++) {
                    for (int j = 0; j < a2.length; j++) {
                        int difference = Math.abs(a1[i].length() - a2[j].length());
                        results[indexCounter] = difference;
                        indexCounter++;
                    }
                }
            } else if (a1.length < a2.length) {

                int indexCounter = 0;
                for (int i = 0; i < a2.length; i++) {
                    for (int j = 0; j < a1.length; j++) {
                        int difference = Math.abs(a2[i].length() - a1[j].length());
                        results[indexCounter] = difference;
                        indexCounter++;
                    }
                }
            }
        int max = results[0];
        for (int i = 1; i < results.length; i++) {
            if (results[i] > max) {
                max = results[i];
            }
        }
        result = max;

        return result;
    }

    public static void main(String[] args) {

        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        System.out.println(mxdiflg(s1, s2));
    }
}

