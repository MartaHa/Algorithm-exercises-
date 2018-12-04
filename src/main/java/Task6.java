public class Task6 {

    public static String encrypt(final String text, final int n) {
        String changedString = "";
        //null  and empty String
        if (text.equals(null)) {
            return null;
        } else if (text.equals("")) {
            return "Empty String";

            //no iteration
        } else {
            if (n <= 0) {
                return text;
            } else {
                int loopCounter = n;
                String textTochange = text;

                while (loopCounter != 0) {
                    String leftChars="";
                    changedString="";
                    char[] splitText = textTochange.toCharArray();
                    for (int i = 1; i < splitText.length; i = i + 2) {
                        changedString += (splitText[i]);
                    }
                    for (int i = 0; i < splitText.length; i = i + 2) {
                        leftChars+= (splitText[i]);
                    }
                    changedString = changedString + leftChars;
                    textTochange = changedString;
                    loopCounter--;
                }
            }
        }return changedString;
    }


    public static String decrypt(final String encryptedText, final int n) {
        // Your code here
        return null;
    }


    public static void main(String[] args) {

        String toEncode = "You've got another thing coming";
        String text = "hsi  etTi sats!";
        System.out.println(encrypt(toEncode,0));
        System.out.println(encrypt(toEncode,2));
        System.out.println(encrypt(text,1));
    }
}
