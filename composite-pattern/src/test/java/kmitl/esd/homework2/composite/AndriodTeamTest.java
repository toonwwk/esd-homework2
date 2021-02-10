package kmitl.esd.homework2.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AndriodTeamTest {

    AndriodTeam andriodTeam = new AndriodTeam();

    @Test
    void getSlogan() {
        assertNotNull(andriodTeam);
        System.out.println("get slogan method is called");
    }
}