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

    @Test
    public void checkHugeInteger_whenBothHaveSameLength_IsGreaterThanTestIsFalse(){

        hugeInteger.parse("4893040");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("4993040");
        assertFalse(hugeInteger.isGreaterThan(hugeInteger2));
    }

    @Test
    public void checkHugeInteger_IsLessThanTestIsTrue(){

        hugeInteger.parse("12345000007839");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("49930405748392009049833");
        assertTrue(hugeInteger.isLessThan(hugeInteger2));
    }

    @Test
    public void checkHugeInteger_whenBothHaveSameLength_IsLessThanTestIsTrue(){

        hugeInteger.parse("5967999");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("5968999");
        assertTrue(hugeInteger.isLessThan(hugeInteger2));
    }

    @Test
    public void checkHugeInteger_whenBothHaveSameLength_IsLessThanTestIsFalse(){

        hugeInteger.parse("40891456999999000000");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("40890456999999000000");
        assertFalse(hugeInteger.isLessThan(hugeInteger2));
    }

    @Test
    public void checkHugeInteger_IsLessThanTestIsFalse(){

        hugeInteger.parse("5899000005678908889990004440000100000004");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("589900000567890888999000444000000000000");
        assertFalse(hugeInteger.isLessThan(hugeInteger2));
    }




    @Test
    public void checkHugeInteger_whenInputIsSameLength_IsLessThanOrEqualsToTestIsFalse(){

        hugeInteger.parse("345748393");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("345748390");
        assertFalse(hugeInteger.isLessThanOrEqualTo(hugeInteger2));
    }



    @Test
    public void checkHugeInteger_whenInputIsSameLength_IsLessThanOrEqualsToTestIsTrue(){

        hugeInteger.parse("589900000567890888999000444000000000000");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("589900000567890888999000444000000000000");
        assertTrue(hugeInteger.isLessThanOrEqualTo(hugeInteger2));
    }



    @Test
    public void checkHugeInteger_IsLessThanOrEqualsToTestIsFalse(){
        hugeInteger.parse("1121114834734738");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("7994003999999");
        assertFalse(hugeInteger.isLessThanOrEqualTo(hugeInteger2));
    }

    @Test
    public void checkHugeInteger_whenItIsEqual_IsLessThanOrEqualsToIsTrueTest(){
        hugeInteger.parse("7994003000000");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("7994003000000");
        assertTrue(hugeInteger.isLessThanOrEqualTo(hugeInteger2));
    }

    @Test
    public void checkHugeInteger_IsLessThanOrEqualsToIsTrueTest(){
        hugeInteger.parse("26388386647744777");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("7994003000000774673");
        assertTrue(hugeInteger.isLessThanOrEqualTo(hugeInteger2));
    }




    @Test
    public void checkHugeInteger_whenInputIsSameLength_IsGreaterThanOrEqualsToTestIsFalse(){

        hugeInteger.parse("345748390");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("345748891");
        assertFalse(hugeInteger.isGreaterThanOrEqualTo(hugeInteger2));
    }



    @Test
    public void checkHugeInteger_whenInputIsSameLength_IsGreaterThanOrEqualsToTestIsTrue(){

        hugeInteger.parse("589900000567890888999000444000000000000");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("589900000567890888999000444000000000000");
        assertTrue(hugeInteger.isGreaterThanOrEqualTo(hugeInteger2));
    }



    @Test
    public void checkHugeInteger_IsGreaterThanOrEqualsToTestIsFalse(){
        hugeInteger.parse("7994003000000");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("5788574834734738");
        assertFalse(hugeInteger.isGreaterThanOrEqualTo(hugeInteger2));
    }

    @Test
    public void checkHugeInteger_whenItIsEqual_IsGreaterThanOrEqualsToIsTrueTest(){
        hugeInteger.parse("7994003000000");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("7994003000000");
        assertTrue(hugeInteger.isGreaterThanOrEqualTo(hugeInteger2));
    }

    @Test
    public void checkHugeInteger_IsGreaterThanOrEqualsToIsTrueTest(){
        hugeInteger.parse("7994003000000774673");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("26388386647744777");
        assertTrue(hugeInteger.isGreaterThanOrEqualTo(hugeInteger2));
    }


    @Test
    public void addTwoHugeInteger_200004Plus200004_isAddMethodsReturns400008Test(){
        hugeInteger.parse("200004");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("200004");
        HugeInteger expected = hugeInteger.add(hugeInteger2);
        assertEquals("400008", expected.toString());
    }

    @Test
    public void addTwoHugeInteger_4000901Plus400_isAddMethodsReturns4001301Test(){
        hugeInteger.parse("400");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("4000901");
        HugeInteger expected = hugeInteger.add(hugeInteger2);
        assertEquals("4001301", expected.toString());
    }

    @Test
    public void addTwoHugeInteger_49999991Plus20_isAddMethodsReturns500000011Test(){
        hugeInteger.parse("20");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("49999991");
        HugeInteger expected = hugeInteger.add(hugeInteger2);
        assertEquals("50000011", expected.toString());
    }

    @Test
    public void addTwoHugeInteger_whenLengthIs40_isAddMethodsReturns900000000000000000000000000000000000000000Test(){
        hugeInteger.parse("8000000000000000000000000000000000000000");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("1000000000000000000000000000000000000000");
        HugeInteger expected = hugeInteger.add(hugeInteger2);
        assertEquals("9000000000000000000000000000000000000000", expected.toString());
    }

    @Test
    public void addTwoHugeInteger_whenLengthIs40_isAddMethodsReturns9999999999999999999999999999999999999999Test(){
        hugeInteger.parse("8000000000000000000000000000000000000000");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("1999999999999999999999999999999999999999");
        HugeInteger expected = hugeInteger.add(hugeInteger2);
        assertEquals("9999999999999999999999999999999999999999", expected.toString());
    }

    @Test
    public void addTwoHugeInteger_whenLengthIsAbove40_ThrowsErrorTest(){
        assertThrows(IllegalArgumentException.class, () ->
        hugeInteger.parse("80000000000000000000000000000000000000004"));
    }

    @Test
    public void addTwoHugeInteger_whenLengthIsAbove40_isAddMethodsThrowsErrorTest(){
        hugeInteger.parse("9999999999999999999999999999999999999999");
        HugeInteger hugeInteger2 = new HugeInteger();
        hugeInteger2.parse("9999999999999999999999999999999999999999");
//        HugeInteger expected = hugeInteger.add(hugeInteger2);
//
//        assertEquals("9999999999999999999999999999999999999998", expected.toString());
        assertThrows(IllegalArgumentException.class, () -> hugeInteger.add(hugeInteger2));
    }


}