package org.learn;
//child class or derived class //child class inheriting methods from parent class

public class DisplayDetails extends PersonalDetails {
	public void work() {
		System.out.println("Working at Cognizant");
	}
	public void designation() {
		System.out.println("Senior Analyst");
	}
	public static void main(String[] args) {
		DisplayDetails d = new DisplayDetails();
	    d.name();
		d.work();
		d.designation();
		d.phNo();
		d.contactAddress();
		d.referrals();
	}
}
