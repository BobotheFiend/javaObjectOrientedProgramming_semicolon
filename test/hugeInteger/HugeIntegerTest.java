package hugeInteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {
    HugeInteger hugeInteger;
    @BeforeEach
    public void setup(){
        hugeInteger = new HugeInteger();
    }
    @Test
    public void createHugeIntegerIsZeroTest() {
        assertTrue(hugeInteger.isZero());
    }


    @Test
    public void createHugeInteger_parseAnEmptyString_isZeroTest() {
        String digits = "";
        hugeInteger.parse(digits);

        assertTrue(hugeInteger.isZero());
    }

    @Test
    public void createHugeInteger_parseFourDigit_isNotZeroAndLengthIsFourTest() {
        String digits = "1234";
        hugeInteger.parse(digits);

        assertFalse(hugeInteger.isZero());
        assertEquals(4, hugeInteger.length());
    }

    @Test
    public void createHugeInteger_parse20Digit_lengthIs20Test() {
        String digits = "12345678901234567893";
        hugeInteger.parse(digits);

        assertEquals(20, hugeInteger.length());
    }



    @Test
    public void createHugeInteger_parseStringThatIsAlphabet_throwsErrorTest() {
        String digits = "abdyekskllsjd2234";
        assertThrows(IllegalArgumentException.class, () -> hugeInteger.parse(digits));
        assertEquals(0, hugeInteger.length());
    }

    @Test
    public void createHugeInteger_parseStringThatContainsOtherItems_throwsErrorTest() {
        String digits = "ab-3455w";
        assertThrows(IllegalArgumentException.class, () -> hugeInteger.parse(digits));
        assertEquals(0, hugeInteger.length());
    }

    @Test
    public void createHugeInteger_parseString_assertThatTheInputMatchesTheToStringMethodTest() {
        String digits = "30000000000090";
        hugeInteger.parse(digits);
        assertEquals(14, hugeInteger.length());
        assertEquals("30000000000090", hugeInteger.toString());
    }

    @Test
    public void checkSameHugeIntegerIsSame_isEqualTestIsTrue(){
        hugeInteger.parse("12345");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("12345");
        assertTrue(hugeInteger.isEquals(hugeInteger2));
    }

    @Test
    public void checkHugeIntegerAreNotSame_isEqualTestIsFalse(){

        hugeInteger.parse("123758989345");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("39912345");
        assertFalse(hugeInteger.isEquals(hugeInteger2));
    }

    @Test
    public void checkHugeIntegerAreNotSame_isNotEqualTestIsTrue(){

        hugeInteger.parse("0045");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("004");
        assertTrue(hugeInteger.isNotEquals(hugeInteger2));
    }

    @Test
    public void checkSameHugeIntegerAreNotSame_isNotEqualTestIsFalse(){

        hugeInteger.parse("2300000");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("2300000");
        assertFalse(hugeInteger.isNotEquals(hugeInteger2));
    }

    @Test
    public void checkHugeInteger_whereIsGreaterThanTestIsTrue(){

        hugeInteger.parse("2000099999094006");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("200000000000000");
        assertTrue(hugeInteger.isGreaterThan(hugeInteger2));
    }

    @Test
    public void checkHugeInteger_whenBothHaveSameLength_IsGreaterThanTestIsTrue(){

        hugeInteger.parse("200000000000009");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("200000000000000");
        assertTrue(hugeInteger.isGreaterThan(hugeInteger2));
    }

}