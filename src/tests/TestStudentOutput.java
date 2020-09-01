package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.*;

public class TestStudentOutput {
	Student student = new Student("John", 1000.0, 20);
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testToString() {
		assertEquals("Student [name=John, monthlyTuition=1000.0, age=20]", student.toString());
	}

}
