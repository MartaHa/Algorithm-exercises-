public class Task5 {
    public static boolean isTriangle(int a, int b, int c) {
        boolean answer = false;
        if (a > 0 && b > 0 && c > 0) {
            if  (a+b >c && a+c >b && c+b >a) {
                answer = true;
            }
        }return answer;
        }


    public static void main(String[] args) {
        System.out.println(isTriangle(7, 2, 2));
    }

}
