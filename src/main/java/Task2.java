public class Task2 {

    public static String findNeddle(Object[] haystack) {
        int neddleIndex = 0;
        for (int i = 0; i < haystack.length; i++) {
            try {
                if (haystack[i].equals("needle")) {
                    neddleIndex = i;
                }
            }catch(NullPointerException e){
            }
        }String message = "found the needle at position " + neddleIndex;
        return message;
    }

    public static void main(String[] args) {
        Object[] array = {"needle", 5, 45, null};
        System.out.println(findNeddle(array));


    }
}
