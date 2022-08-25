package org.company;

public class CompanyInfo {

	private void companyName() {
		System.out.println("Company Name");

	}
	private void companyId() {
		System.out.println("Company ID");

	}private void companyAddress() {
		System.out.println("Company Address");

	}

	public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.companyName();
	    c.companyId();
	    c.companyAddress();
	}
}
