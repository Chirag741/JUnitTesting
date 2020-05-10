package JUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAddNumbers {

	@Test
	public void test() {
		JUnitFunction junit = new JUnitFunction();
		int result = junit.addnumbers(100,200);
		assertEquals (300,result);
	}

}
