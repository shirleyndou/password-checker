
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {
    public static int counter = 0;
    public boolean passwordIsOk(String password) {
        try {
            if (passwordIsValid(password)) {
                System.out.println(passwordIsValid(password));
                System.out.println("Password is okay");
                counter++;
            } else {
                System.out.println(passwordIsValid(password));
                System.out.println("Please try again!!!");
            }

        } catch(Exception e){
            e.printStackTrace();
            System.err.println("Please try again!!!");
        }
        return passwordIsValid(password);
    }


    public boolean passwordIsValid(String password) {

        Pattern sPattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher sMatcher = sPattern.matcher(password);

        char check; //checks for all the strings if they are there

        boolean countLength = false;
        int countDigits = 0;
        int countUpperCases =0;
        int countLowerCase=0;

        for(int j = 0; j< password.length(); j++) {
            check = password.charAt(j);
            if (password.length() > 7) {
                countLength =true;
               // countLength++
                counter++;
                break;
            }
        }

        if(!countLength){
            System.out.println("Password should be longer than 8 characters");
        }

            for (int i = 0; i < password.length(); i++) {
                check = password.charAt(i);
                if(Character.isDigit(check)){
                    countDigits++;
                    counter++;
                    break;
                }
            }
            if(countDigits < 1){
                System.out.println("Password should consists of at least 1 digit");
            }

            for (int upper_case =0; upper_case<password.length(); upper_case++)
            {
                check = password.charAt(upper_case);
                if(Character.isUpperCase(check))
                {
                    countUpperCases++;
                    counter++;
                    break;
                }
            }
            if(countUpperCases < 1){
                System.out.println("Password should consists of at least 1 upper case");
            }

            for (int lower_case =0; lower_case<password.length(); lower_case++)
            {
                check = password.charAt(lower_case);
                if(Character.isLowerCase(check))
                {
                    countLowerCase++;
                    counter++;
                    break;
                }

            }
            if(countLowerCase < 1){
                System.out.println("Password should consists of at least 1 lower case");
            }

            if (sMatcher.matches()) {
                System.out.println("Password should have at least 1 special character");
               counter++;
            }

        if (counter >= 2) {
            return true;
        }
        return false;
    }
}
