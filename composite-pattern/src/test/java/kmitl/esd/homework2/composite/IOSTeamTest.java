package kmitl.esd.homework2.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IOSTeamTest {

    IOSTeam iOSTeam = new IOSTeam();

    @Test
    void getSlogan() {
        assertNotNull(iOSTeam);
        System.out.println("get slogan method is called");
    }
}