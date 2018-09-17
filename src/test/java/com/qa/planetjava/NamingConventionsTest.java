package com.qa.planetjava;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author divine 2018-09-17
 */
public class NamingConventionsTest {

	NamingConventionController n = new NamingConventionController();
	
	@Test
    public void nameCheck() throws Exception {
		
		assertEquals("Pt", n.getSymbols().get(n.getElements().indexOf("Protactinium")));
		assertEquals("Cf", n.getSymbols().get(n.getElements().indexOf("Californium")));
		assertEquals("Iu", n.getSymbols().get(n.getElements().indexOf("Lionoium")));
    }
}
