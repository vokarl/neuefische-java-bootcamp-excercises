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

    public static boolean containsUpperAndLowerCase(String password) {
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;


        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            if (Character.isLowerCase(c)) {
                hasLowerCase =  true;
            }
            if (hasUpperCase && hasLowerCase) {
                return true;
            }
        }return false;
    }

    public static boolean isNoWeakPassword(String password) {
    String[] passwordSet ={"password", "password1", "password2", "password3", "password4", "password5", "password6", "password7", "password8", };
            for (String currentPassword : passwordSet) {
                if (currentPassword.equals(password)) {
                    return true;
                }
            }return false;
    }

    public static boolean specialCharacter(String password) {
        String[] specialCharacters = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "[", "]", "{", "}", ";", ":", "'", "\"", ",", ".", "<", ">", "/", "?", "|", "\\","~", "`"};
        for (char c : password.toCharArray()) {
            for (String currentSpecialCharacter : specialCharacters) {
                if (String.valueOf(c).equals(currentSpecialCharacter)) {
                    return true;
                }
            }




   }return false;
    }
}


