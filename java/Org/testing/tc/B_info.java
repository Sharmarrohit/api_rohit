package Org.testing.tc;

public class B_info
{
private String firstname;
private String lastname;
//private String address;
private String age;
private String ID;
private String designation;
private addressinfo[] address;
public addressinfo[] getAddress() {
	return address;
}
public void setAddress(addressinfo[] address) {
	this.address = address;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}



public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
	
}
