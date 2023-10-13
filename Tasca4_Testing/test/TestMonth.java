package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import n1exercici1.Months;

class TestMonth {

	private static String[] monthList;

	@BeforeAll
	static void creacion() {
	Months months = new Months();
	monthList = months.createMonths();
	}
	
	@Test
	 void testMonth() {
		String expected = "Agosto";
		assertEquals(expected,monthList[7]);
	}
		
	@Test
	void isNotNull() {
		
		assertNotNull("--Not null--", monthList);
	}
	

		
	@Test
	void testArrayLength() {
		
		int expected = 12;
		assertEquals(expected, monthList.length);
		
		
		
	}
		
		
	

}
