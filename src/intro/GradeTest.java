package intro;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test.
 * 
 * @author jaanus
 */
public class GradeTest {

	/**
	 * Test method for {@link Grade#grade(double)}.
	 */
	@Test
	public void testGrade() {
		assertTrue(Grade.grade(0).equalsIgnoreCase("fail"));
		assertTrue(Grade.grade(50).equalsIgnoreCase("fail"));
		assertTrue(Grade.grade(51).equalsIgnoreCase("sufficient"));
		assertTrue(Grade.grade(55).equalsIgnoreCase("sufficient"));
		assertTrue(Grade.grade(60).equalsIgnoreCase("sufficient"));
		assertTrue(Grade.grade(66).equalsIgnoreCase("satisfactory"));
		assertTrue(Grade.grade(61).equalsIgnoreCase("satisfactory"));
		assertTrue(Grade.grade(70).equalsIgnoreCase("satisfactory"));
		assertTrue(Grade.grade(71).equalsIgnoreCase("good"));
		assertTrue(Grade.grade(80).equalsIgnoreCase("good"));
		assertTrue(Grade.grade(81).equalsIgnoreCase("very good"));
		assertTrue(Grade.grade(90).equalsIgnoreCase("very good"));
		assertTrue(Grade.grade(91).equalsIgnoreCase("excellent"));
		assertTrue(Grade.grade(100).equalsIgnoreCase("excellent"));
		assertTrue(Grade.grade(50.5).equalsIgnoreCase("sufficient"));
		assertTrue(Grade.grade(60.5).equalsIgnoreCase("satisfactory"));
		assertTrue(Grade.grade(70.5).equalsIgnoreCase("good"));
		assertTrue(Grade.grade(80.5).equalsIgnoreCase("very good"));
		assertTrue(Grade.grade(90.5).equalsIgnoreCase("excellent"));
	}

	/**
	 * Test method for {@link Grade#grade(double)}.
	 */
	@Test(expected = RuntimeException.class)
	public void testNegGrade() {
		Grade.grade(-1);
	}

	/**
	 * Test method for {@link Grade#grade(double)}.
	 */
	@Test(expected = RuntimeException.class)
	public void testIllegalGrade() {
		Grade.grade(200);
	}

}
