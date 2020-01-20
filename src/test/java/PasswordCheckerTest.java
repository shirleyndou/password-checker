import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    PasswordChecker passwordChecker =  new PasswordChecker();

    @Test
    void passwordIsValid() {

        String password = "ahfghghg0000%$^&%$A";
        boolean check = passwordChecker.exist(password) &&
                            passwordChecker.longer(password) &&
                            passwordChecker.lowerCase(password) &&
                            passwordChecker.upperCase(password) &&
                            passwordChecker.digit(password) &&
                            passwordChecker.character(password);
        assert(check);

    }

    @Test
    void passwordIsOk() {

        String password = "aA";
        assert(passwordChecker.passwordIsOk(password));
    }
}