package JUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddstrings {

	@Test
	public void test() {
		JUnitFunction junitString = new JUnitFunction();
		String result = junitString.addstring("chirag","project");
		assertEquals("chiragproject",result);
	}

}
