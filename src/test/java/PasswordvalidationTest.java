import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    public void lengthValidationTest_true_when_bigger7() {
        //GIVEN
        String password = "1234567";
        boolean expected = false;

        //WHEN
        boolean actual = Passwordvalidation.lengthValidation(password);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    public void otherTest_true_when_bigger20() {
        //GIVEN
        String password = "12345678901234567890";
        boolean expected = true;

        //WHEN
        boolean actual =Passwordvalidation.lengthValidation(password);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    public void containsDigitsTest_true_when_digit() {
        //GIVEN
        String password = "1";
        boolean expected = true;

        //WHEN
        boolean actual =Passwordvalidation.containsDigits(password);
        //THEN
        assertEquals(expected, actual);
    }


}