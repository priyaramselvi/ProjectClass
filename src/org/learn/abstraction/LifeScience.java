package org.learn.abstraction;

public class LifeScience implements Testing, Development {

	@Override
	public void employeeCount() {
		System.out.println("Employee Count is 900");
		
	}

	@Override
	public void designation() {
		System.out.println("Designations available are PT,P,A,SA,M,SM,AD,D");
		
	}

	@Override
	public void devss() {
		System.out.println("Dev skill set are x,y,z");
		
	}

	@Override
	public void PAsalary() {
		System.out.println("Salary for PA is 35K");
		
	}

	@Override
	public void tstss() {
		System.out.println("Dev skill set are m,n,o");
		
	}
	public static void main(String[] args) {
		LifeScience l = new LifeScience();
		l.employeeCount();
		l.designation();
		l.PAsalary();
		l.devss();
		l.tstss();

	}
}
