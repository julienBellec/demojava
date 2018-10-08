package fr.poleemploi.patterns.builder;

public class Person {

	private String firstname;
	private String lastname;
	private String phoneNumber = "";
	private String address;

	protected Person(final String firstName, final String lastName) {
		this.firstname = firstName;
		this.lastname = lastName;
	}

	protected void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	protected void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return String.format("Firstname %s - Lastname %s - PhoneNumber %s - Adress %s", firstname, lastname, phoneNumber, address);
		
	}
	
	@Override
	public int hashCode() {
		return firstname.hashCode() + lastname.hashCode();
	}
	
}
