public class Task1 {

    public static int digital_root(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10 + digital_root(n / 10));
        }
    }

    public static void main(String[] args) {
        System.out.println(digital_root(345));
    }
}
