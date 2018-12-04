public class Task3 {

    public static boolean validatePin(String pin) {
        String pattern = "^\\d{4}(\\d{2})?$";
        if (pin.matches(pattern)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
    }
}

