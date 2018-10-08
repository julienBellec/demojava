package fr.poleemploi.patterns.builder;

public class Main {

	public static void main(String[] args) {

		Person person = new PersonBuilder("FirstName", "LastName").withAdress("Nantes").withPhoneNumber("0102030405").build();
		System.out.println(person.toString());

	}

}
