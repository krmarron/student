package model;

public class StudentLogic {
	public double calculateYearlyTuition(Student student) {
		double yearlyTuition = 0;
		yearlyTuition = student.getMonthlyTuition() * 12;
		return yearlyTuition;
	}
	
	public double calculateFinancialAid(Student student) {
		double financialAid = 0;
		
		if(student.getMonthlyTuition() < 1000) {
			financialAid = 250;
		} else {
			financialAid = 500;
		}
		return financialAid;
	}
	
	public boolean isTeenager(Student student) {
		boolean teen;
		
		if(student.getAge() < 20) {
			teen = true;
		} else {
			teen = false;
		}
		return teen;
	}
}
