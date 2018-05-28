import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SampleTest {

	@Test
	public void simpleTestPass() {
		int a = 5;
		int b = 10 ;
		assertTrue(a+b == 15);
		
	}
	@Test
	public void simpleTestFail() {
		int a = 5;
		int b = 10 ;
		assertTrue(a+b == 25);
		
	}
}
