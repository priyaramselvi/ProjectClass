package org.polymorphism;

public class OverridingClass extends LoginDetails {
	public void password(String password) {
		System.out.println("NewPassword is "+password);
	}
	public void emailId(String emailId) {
		System.out.println("email ID is "+emailId);
	}
	public static void main(String[] args) {
		OverridingClass p=new OverridingClass();
		p.password("xyz");
		p.userName("mPriya");
		p.emailId("priyaram.selvi@gmail.com");
	}
}
