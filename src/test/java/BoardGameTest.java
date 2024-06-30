import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardGameTest {

    //War NICHT Teil der Aufgabe. Hiermit könnt ihr aber x & y in PlayerCharacter static machen ohne das sich eure Tests gegenseitig manipulieren.
    @BeforeEach
    // -> Wird vor jedem Test ausgeführt
    void resetAllXY() {
        //Setze x & y wieder auf 0. Das macht jeden Test wieder erwartbar, da immer von x&y=0 ausgegangen wird.
        .x =0;
        PlayerCharacter.y =1;
    }

    @Test
    public void getXTest_PlayerCharacter_return_0() {
        //GIVEN
        int expected = 0;
        //WHEN
        int actual = PlayerCharacter.getX();
        //THEN
        assertEquals(0, actual);
    }

}













