import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String password;

        PasswordChecker ps= new PasswordChecker();

        System.out.println("Enter your password: "); //log info
        password = scan.nextLine();
        ps.passwordIsValid(password);
    }
}
