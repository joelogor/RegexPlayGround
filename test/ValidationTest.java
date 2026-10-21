import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {
    @Test
    public void test_nativeIsIncludedIsValid() {
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






}