public class PasswordChecker {

    public void passwordIsValid(String password) {

        if (!exist(password)) {
            System.out.println("1. Password should exist");
        }
        if (!longer(password)) {
            System.out.println("2. Password should be longer than 8 characters");
        }
        if (!lowerCase(password)) {
            System.out.println("3. Password should have at least one lowercase letter");
        }
        if (!upperCase(password)) {
            System.out.println("4. Password should have at least one uppercase letter");
        }
        if (!digit(password)) {
            System.out.println("5. Password should at least have one digit");
        }
        if (!character(password)) {
            System.out.println("6. Password should have at least one special character");
        }
    }

    public boolean passwordIsOk(String password) {
        int counter = 0;

        if (exist(password)) {
            counter++;
        }
        if (longer(password)) {
            counter++;
        }
        if (lowerCase(password)) {
            counter++;
        }
        if (upperCase(password)) {
            counter++;
        }
        if (digit(password)) {
            counter++;
        }
        if (character(password)) {
            counter++;
        }

        if (!(exist(password) && longer(password))) {
            System.err.println("Password is never okay if condition 1 and 2 are not met.");
            return false;
        }

        return counter >= 3;
    }


    boolean exist(String password) {
        return password.length() >= 1;
    }

    boolean longer (String password) {
        return password.length() >= 8;
    }

    boolean lowerCase (String password) {
        for (int i =0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
               }
        }
        return false;
    }

    boolean upperCase (String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    boolean digit (String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    boolean character (String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
