package comp.model;

import comp.model.Address;
import comp.model.Name;

public class PersonalInformation {
	Name name;
	Address address;

	public PersonalInformation(Name name, Address address) {
		this.name = name;
		this.address = address;
	}

	public Name getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}
}
