/*import basics.PlayerCharacter;
import boardGame.PlayerCharacter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {

    //War NICHT Teil der Aufgabe. Hiermit könnt ihr aber x & y in PlayerCharacter static machen ohne das sich eure Tests gegenseitig manipulieren.
    @BeforeEach
    // -> Wird vor jedem Test ausgeführt
    void resetAllXY() {
        //Setze x & y wieder auf 0. Das macht jeden Test wieder erwartbar, da immer von x&y=0 ausgegangen wird.
        PlayerCharacter.x =0;
        PlayerCharacter.y =0;
    }

    @Test
        public void getX_Test_returns_0(){
            //GIVEN
        int expected = 0;
            //WHEN
        int actual = PlayerCharacter.getX();
            //THEN
        assertEquals(expected, actual);
        }

@Test
    public void getY_Test_returns_0(){
    //GIVEN
    int expected = 0;
    //WHEN
    int actual = PlayerCharacter.getY();
    //THEN
    assertEquals(expected, actual);
}
    @Test
    public void moveUp_Test_1_whenW(){
        //GIVEN
        String direction = "w";
        int expected = 1;
        //WHEN
        int actual = PlayerCharacter.move(direction);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    public void moveDown_Test_neg1_whenS(){
        //GIVEN
        String direction = "s";
        int expected = -1;
        //WHEN
        int actual = PlayerCharacter.move(direction);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    public void moveRight_Test_1_whenD(){
        //GIVEN
        String direction = "d";
        int expected = 1;
        //WHEN
        int actual = PlayerCharacter.move(direction);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    public void moveLeft_Test_neg1_whenA(){
        //GIVEN
        String direction = "a";
        int expected = -1;
        //WHEN
        int actual = PlayerCharacter.move(direction);
        //THEN
        assertEquals(expected, actual);
    }





}







*/