package tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RegexValidationTest {

    @Test
    public void nativeEmailValidationIsTrue(){
        String input = "p.nwankwo@native.semicolon.africa";

        boolean actual = RegexValidation.emailValidator(input);

        assertTrue(actual);
    }

    @Test
    public void nonNativeEmailValidationIsFalse(){
        String input = "nnamdicavevn@gmail.com";

        boolean actual = RegexValidation.emailValidator(input);

        assertFalse(actual);
    }

    @ParameterizedTest
    @CsvSource({
            "nnm_@, false",
            "'       ', false",
            "ASHEYRUWI_@, true",
            "tr  ytid_, false",
            "Password@@, true"

    })
    public void passwordValidationTest(String password, boolean expected){
      assertEquals(expected, RegexValidation.passwordValidator(password));
    }
}