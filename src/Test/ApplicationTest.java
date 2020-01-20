/*
 * ******************************************************
 *  * Copyright (C) 2020 Ruikang Xu: xuruikang6@hotmail.com
 *
 *  * permission of Ruikang Xu
 *  ******************************************************
 */

package Test;
import RuikangXu.Application;
import RuikangXu.Module.Planet;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    Application test = new Application();
    @Test
    void isNumTest() {
        boolean b = test.isNum("1s");
        assertFalse(b);
        assertNotEquals(true,b);
    }

    @Test
    void getPlanetByNameTest() {
        Planet nwPlanet = test.getPlanetBySS("j1");
        assertNull(nwPlanet);
    }

    @Test
    void getPlanetMovePossibilities() {
        Planet planet = new Planet("T", 1, "red");
        Planet neighbour = new Planet("T", 2, "red");
        planet.getAvailablePlanets().add(neighbour);
        assertEquals(planet.getAvailablePlanets().size(), 1);
        assertEquals(planet.getAvailablePlanets().get(0), neighbour);
    }

    @Test
    void getVaildInputTest(){
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("a1".getBytes());
        System.setIn(in);
        // do your thing
        String str = test.getVaildInput();
        assertEquals("a1",str);
        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }
}