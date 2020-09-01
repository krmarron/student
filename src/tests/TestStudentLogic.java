package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.*;

public class TestStudentLogic {
	StudentLogic studL = new StudentLogic();
	Student student = new Student("Jeff");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateFinancialAid() {
		student.setMonthlyTuition(1500);
		double financialAid = studL.calculateFinancialAid(student);
		assertEquals(500, financialAid, 0.0);
	}
	
	@Test
	public void testStudentIsTeen() {
		student.setAge(19);
		assertTrue(studL.isTeenager(student));
	}
	
	@Test
	public void testStudentIsNotTeen() {
		student.setAge(21);
		assertFalse(studL.isTeenager(student));
	}
}