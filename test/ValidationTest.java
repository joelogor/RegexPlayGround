import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {
    @Test
    public void test_emailIsValid() {
        String email = "p.nwankwo@native.semicolon.africa";
        boolean expected = true;
        boolean actual = Validation.ValidateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void test_nativeIsexcludedIsValid() {
        String email = "p.nwankwo@semicolon.africa";
        boolean expected = true;
        boolean actual = Validation.ValidateEmail(email);
        assertEquals(expected, actual);
    }

    @Test
    public void test_atSignIsNotIncludedIsInValid() {
        String email = "p.nwankwonative.semicolon.africa";
        boolean expected = false;
        boolean actual = Validation.ValidateEmail(email);
        assertEquals(expected, actual);
    }

    @Test
    public void test_dotAfricaIsNotIncludedIsInValid() {
        String email = "p.nwankwo@native.semicolon";
        boolean expected = false;
        boolean actual = Validation.ValidateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void test_dotSemicolonIsNotIncludedIsInValid() {
        String email = "p.nwankwonative.africa";
        boolean expected = false;
        boolean actual = Validation.ValidateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testEmailIsEmptyIsInValid() {
        String email = "";
        boolean expected = false;
        boolean actual = Validation.ValidateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void testEmailWithBlankSpaceIsInValid() {
        String email = "   ";
        boolean expected = false;
        boolean actual = Validation.ValidateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void test_firstCharacterIsNotAlphabetIsInValid() {
        String email = "2.nwankwo@native.semicolon.africa";
        boolean expected = false;
        boolean actual = Validation.ValidateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void test_firstCharacterBeforeDotIsNotOneAlphabetIsInValid() {
        String email = "pp.nwankwo@native.semicolon.africa";
        boolean expected = false;
        boolean actual = Validation.ValidateEmail(email);
        assertEquals(expected, actual);
    }
    @Test
    public void test_passwordIsValid() {
        String password = "joel@123";
        boolean expected = true;
        boolean actual = Validation.ValidatePassword(password);
        assertEquals(expected, actual);
    }
    @Test
    public void test_passwordIsEmptyIsInValid() {
        String password = "";
        boolean expected = false;
        boolean actual = Validation.ValidatePassword(password);
        assertEquals(expected, actual);
    }
    @Test
    public void test_passwordWithBlankSpaceIsInValid() {
        String password = "   ";
        boolean expected = false;
        boolean actual = Validation.ValidatePassword(password);
        assertEquals(expected, actual);
    }

    @Test
    public void test_passwordWithoutDigitIsInValid() {
        String password = "Javacode@ee ";
        boolean expected = false;
        boolean actual = Validation.ValidatePassword(password);
        assertEquals(expected, actual);
    }
    @Test
    public void test_passwordWithLengthLessThan8IsInValid() {
        String password = "joel@12";
        boolean expected = false;
        boolean actual = Validation.ValidatePassword(password);
        assertEquals(expected, actual);
    }

    @Test
    public void test_passwordWithLengthMoreThan16IsInValid() {
        String password = "joel@124433443443434";
        boolean expected = false;
        boolean actual = Validation.ValidatePassword(password);
        assertEquals(expected, actual);
    }
    @Test
    public void test_passwordWithWhiteSpaceIsInValid() {
        String password = "Java code@1";
        boolean expected = false;
        boolean actual = Validation.ValidatePassword(password);
        assertEquals(expected, actual);
    }
    @Test
    public void test_passwordWithWh$SignIsInValid() {
        String password = "Welcome123$";
        boolean expected = false;
        boolean actual = Validation.ValidatePassword(password);
        assertEquals(expected, actual);
    }







}