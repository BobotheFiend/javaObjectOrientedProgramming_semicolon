package tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidation {

    public static boolean emailValidator(String email){
        String regex = "^[a-z]\\.[a-z]+@native\\.semicolon\\.africa$";
//        String regex = "^[a-z]\\.[a-z]+@[a-z]{6}\\.[a-z]{9}\\.[a-z]{6}$";

        return email.matches(regex);
    }
    public static boolean passwordValidator(String password){
        String regex = "[a-zA-z0-9@#_+]{8,16}";

        return password.matches(regex);
    }

}
