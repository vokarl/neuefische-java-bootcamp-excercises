public class Passwordvalidation {
    public static void main(String[] args) {
        System.out.println("hello world");
    }

    public static boolean lengthValidation(String password) {
        return password.length() > 7;
    }

    public static boolean containsDigits(String password) {

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

}


