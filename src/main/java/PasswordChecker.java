
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {

    public boolean passwordIsOk(String password) {
            try {
                    if (passwordIsValid(password)) {
                        return true;
                    }

                 else {
                    System.out.println(" Password should be 8 chars long \n consist of at least one digit \n upper case, lower case and a special character");
                    System.out.println("Please try again!!!");
                   return false;

                }

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Please try again!!!");
            }
            return false;
    }


    public boolean passwordIsValid(String password) {

        Pattern sPattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher sMatcher = sPattern.matcher(password);

        boolean number = false;
        boolean upper_case = false;
        boolean lower_case = false;
        char check; //checks for all the strings if they are there

        if (password.length() > 7) {
            for (int i = 0; i < password.length(); i++) {
                check = password.charAt(i);
                if (Character.isDigit(check)) {
                    number = true;
                } else if (Character.isUpperCase(check)) {
                    upper_case = true;
                } else if (Character.isLowerCase(check)) {
                    lower_case = true;
                } else if (!sMatcher.matches()) {
                    return true;
                }


                if (number && upper_case && lower_case) {
                    System.out.println("Password is okay!");
                    return true;
                }

            }

        }
        return false;
    }
}