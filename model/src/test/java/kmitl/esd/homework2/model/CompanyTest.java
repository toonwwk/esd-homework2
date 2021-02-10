package kmitl.esd.homework2.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    Company c = Company.create(CompanyType.LOCAL);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getId() {
        System.out.println("Test getId method");
        c.id = 5;
        assertEquals(5, c.getId());
    }

    @org.junit.jupiter.api.Test
    void setId() {
        System.out.println("Test setId method");
        c.setId(4);
        assertEquals(4, c.id);
    }

    @org.junit.jupiter.api.Test
    void getName() {
        System.out.println("Test getName method");
        c.name = "Super company";
        assertEquals("Super company", c.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
        System.out.println("Test setName method");
        c.setName("Super company");
        assertEquals("Super company", c.name);
    }

    @org.junit.jupiter.api.Test
    void testSetName() {
    }

    @org.junit.jupiter.api.Test
    void getTaxId() {
    }
}