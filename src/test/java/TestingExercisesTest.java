import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingExercisesTest {

    @Test
    public void sum_expect9_when4and5() {
       //GIVEN
        int a = 4;
        int b = 5;
        int expected = 9;

        //WHEN
        int actual = TestingExercises.sum(a, b);
        //THEN
        assertEquals(9, actual);
    }

    @Test
    public void isEvenTest_expectTrue_whenTrue() {
        //GIVEN
        int number = 4;
        boolean expected = true;
        //WHEN
        boolean actual = TestingExercises.isEven(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void productTest_expect20_when4and5() {
        //GIVEN
        int dx = 4;
        int ex = 5;
        int expected = 20;
        //WHEN
        int actual = TestingExercises.product(dx, ex);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    public void toUpperCaseTest_expectU_when_u() {
        //GIVEN
        String letter = "u";
        String expected = "U";
        //WHEN
        String actual = TestingExercises.toUpperCase(letter);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    public void numberTest_expectPositiveNumber() {
        //GIVEN
        int a = 4;
        boolean expected = true;

        //WHEN
        boolean actual = TestingExercises.number(a);
        //THEN
        assertEquals(true, actual);
    }



    @Test
    public void negativeTest_expectTrue_when_negativeNumber() {
        //GIVEN
        int b = -4;
        boolean expected = true;

        //WHEN
        boolean actual = TestingExercises.negative(b);
        //THEN
        assertEquals(true, actual);
    }













}