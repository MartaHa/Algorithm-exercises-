import java.io.*;

public class Task6 {

    public static String encrypt(final String text, final int n) throws IOException {
        String changedString = "";

        //null  and empty String
        if (text ==null || "".equals(text.trim()) ||n <= 0) {
            changedString= text;
        } else {
            int counter = n;
            while (counter != 0) {
                changedString=split(text);
                counter--;
            }
        }
        return changedString;
    }

    public static String split(final String text) throws IOException {

     StringBuffer sb = new StringBuffer();
        String result;
        int middlePosition = text.length()/2;
        int positionToAdd=1;

        for (int i = 1; i <middlePosition; i = i++) {
            sb.append(text.charAt(positionToAdd));
            positionToAdd=+2;

        }
        positionToAdd=0;
        for (int i = 0; i < middlePosition; i = i++) {
            sb.append(text.charAt(positionToAdd));
            positionToAdd=+2;
        }
        if(text.length()%2==1){
            sb.append(text.charAt(text.length()-1));
        }
        result = sb.toString();
        return result;
    }

    private static String buildString(final String decryptedText) throws IOException {
        InputStream is = new ByteArrayInputStream(decryptedText.getBytes("UTF-8"));

        char[] buf = new char[2048];
        Reader r = new InputStreamReader(is, "UTF-8");

        while (true) {
            int n = r.read(buf);
            if (n < 0)
                break;
        }
        StringBuffer sb = new StringBuffer();

        int middlePosition = decryptedText.length()/2;

        for (int i = 0; i < middlePosition; i = i++) {
            sb.append(decryptedText.charAt(i+1));
            sb.append(decryptedText.charAt(i));
        }
        if (decryptedText.length() % 2 == 1) {
            sb.append(decryptedText.charAt(decryptedText.length() - 1));
        }
        return sb.toString();

    }


    public static String decrypt(final String encryptedText, final int n) throws IOException {
        String changedString = "";
        //null  and empty String
        if (encryptedText ==null || "".equals(encryptedText.trim()) ||n <= 0) {
            changedString= encryptedText;
        } else {
            int counter = n;
            while (counter != 0) {
                changedString=buildString(encryptedText);
                counter--;
            }

        }

        return changedString;
    }
}
