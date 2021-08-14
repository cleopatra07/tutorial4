package tutorial4;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tutorial4.Calc;

/**
 * Unit test for simple App.
 */
public class TestAdd {


	private Calc cal;
 
	@BeforeEach
	void setUp() throws Exception { 
		cal = new Calc();
	}		
 
	@AfterEach
	void tearDown() throws Exception {
	}
 
	@Test
	public void testAdd() {
	int result = cal.add(7,3);
	assertEquals(result,10);
}
 
}
