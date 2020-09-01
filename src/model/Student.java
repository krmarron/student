package model;

public class Student {
	private String name;
	private double monthlyTuition;
	private int age;
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlyTuition() {
		return monthlyTuition;
	}
	public void setMonthlyTuition(double monthlyTuition) {
		this.monthlyTuition = monthlyTuition;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Constructors
	public Student() {
		setName(name);
		setMonthlyTuition(monthlyTuition);
		setAge(age);
	}
	
	public Student(String n, double mt, int a) {
		setName(n);
		setMonthlyTuition(mt);
		setAge(a);
	}
	public Student(String n) { 
		setName(n);
	}
	
	//Display Method
	@Override
	public String toString() {
		return "Student [name=" + name + ", monthlyTuition=" + monthlyTuition + ", age=" + age + "]";
	}

	
}
