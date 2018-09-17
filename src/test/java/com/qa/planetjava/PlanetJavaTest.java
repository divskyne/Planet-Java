package com.qa.planetjava;
import org.junit.Test;

import com.qa.planetjava.PlanetJava;

import static org.junit.Assert.*;

/**
 * @author divine 2018-09-16
 */

public class PlanetJavaTest {

	PlanetJava pj = new PlanetJava();

    @Test
    public void examples() throws Exception {
        assertTrue(pj.isValid("Sveggjerium", "Ee"));
        assertTrue(pj.isValid("Zockurijirium", "Zr"));
        assertTrue(pj.isValid("Jeffkanium", "Kn"));
        assertFalse(pj.isValid("Jefftzlon", "Zt"));
        assertFalse(pj.isValid("Jeffntzum", "Nn"));
        assertFalse(pj.isValid("Tuffjeffium", "Ty"));
    }

    @Test
    public void bonus() throws Exception {
        assertEquals("Ei", pj.firstValidSymbol("Gozerium"));
        assertEquals("Ie", pj.firstValidSymbol("Slimyrine"));
    }
}