import java.util.Arrays;

/**
 * Write Number in Expanded Form
 * <p>
 * You will be given a number and you will need to return it as a string in Expanded Form. For example:
 * <p>
 * Kata.expandedForm(12); # Should return "10 + 2"
 * Kata.expandedForm(42); # Should return "40 + 2"
 * Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
 * <p>
 * NOTE: All numbers will be whole numbers greater than 0.
 */
public class Task14 {

    public static String expandedForm(int num) {
        String expandedFormString = "";
        String numberToString = Integer.toString(num);
        String[] stringParts = numberToString.split("");


        for (int i = 0; i < stringParts.length - 1; i++) {
            if (stringParts[i].equals("0")) {
                continue;
            } else {
                String tens = "";
                for (int j = i; j < stringParts.length - 1; j++) {
                    tens += 0;
                }
                expandedFormString += (stringParts[i] + tens + " + ");
                tens = tens + "0";

            }

        }
        String lastNumber = stringParts[stringParts.length - 1];
        if (!lastNumber.equals(0));
        {
            expandedFormString += stringParts[stringParts.length - 1];
        }
        return expandedFormString;
    }
}