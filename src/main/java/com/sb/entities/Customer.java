package com.sb.entities;

public class Customer 
{
	protected String customerName;
	protected String contactNo;
	protected String emailAddress;
	
	public Customer()
	{
		
	}
	public Customer(String customerName,String contactNo,String emailAddress)
	{
		this.customerName=customerName;
		this.contactNo=contactNo;
		this.emailAddress=emailAddress;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", contactNo=" + contactNo + ", emailAddress=" + emailAddress
				+ "]";
	}
	

}
