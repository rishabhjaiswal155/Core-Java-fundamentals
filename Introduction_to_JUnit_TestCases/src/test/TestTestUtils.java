package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utils.TestUtils;
class TestTestUtils {

	@Test
	void testcalculate() {
		assertEquals(14, TestUtils.calculate(4,3));
	}

}
