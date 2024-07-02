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
    @Test
    public void containsUpperAndLowerCaseTest_true_when_aA() {
        //GIVEN
        String password = "Password";
        boolean expected = true;
        //WHEN
        boolean actual =Passwordvalidation.containsUpperAndLowerCase(password);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    public void containsUpperCaseTest_true_when_A() {
        //GIVEN
        String password = "PASSWORD";
        boolean expected = true;
        //WHEN
        boolean actual =Passwordvalidation.containsUpperAndLowerCase(password);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    public void containsLowerCaseTest_true_when_a() {
        //GIVEN
        String password = "password";
        boolean expected = true;
        //WHEN
        boolean actual =Passwordvalidation.containsUpperAndLowerCase(password);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    public void isNoWeakPasswordTest_true_when_weakPassword() {
        //GIVEN
        String password = "password1";
        boolean expected = true;

        //WHEN
        boolean actual =Passwordvalidation.isNoWeakPassword(password);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    public void specialCharacterTest_true_when_specialCharacter() {
        //GIVEN
        String password = "~";
        boolean expected = true;

        //WHEN
        boolean actual =Passwordvalidation.specialCharacter(password);
        //THEN
        assertEquals(expected, actual);
    }




}