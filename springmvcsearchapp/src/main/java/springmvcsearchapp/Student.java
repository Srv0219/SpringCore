package springmvcsearchapp;

public class Student {
	private String fname;
	private String lname;
	private String uname;
	private Address address;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", uname=" + uname + ", address=" + address + "]";
	}
	
	
	

}
