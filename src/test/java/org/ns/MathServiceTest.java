package org.ns;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MathServiceTest {

	private static MathService service=null;
	
	@BeforeAll
	static void initialize() {
		service = new MathService();
	}
	
	@Test
	void testPositiveNumberAddition() {
		assertEquals(2, service.add(1D, 1D));
	}
	
	@Test
	void testNegativeNumberAddition() {
		assertEquals(-3, service.add(-1D, -2D));
	}
	
	@Test
	void testPositveAdditionWithNegative() {
		assertEquals(2, service.add(-1D, 3D));
	}

}
