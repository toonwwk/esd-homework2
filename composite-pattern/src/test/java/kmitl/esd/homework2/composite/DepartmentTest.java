package kmitl.esd.homework2.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    Department d = new Department();
    IOSTeam i = new IOSTeam();

    @Test
    void addTeam() {
        d.addTeam(i);
        System.out.println("team is added");
    }

    @Test
    void getSlogan() {
        assertNotNull(d);
        System.out.println("get slogan method id called");
    }
}