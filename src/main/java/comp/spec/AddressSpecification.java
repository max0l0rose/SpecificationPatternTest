package comp.spec;

import comp.model.PersonalInformation;

public class AddressSpecification extends AbstractSpecification {
	@Override
	public boolean isSatisfiedBy(Object candidate) {
		System.out.println("isSatisfiedBy of spec.AddressSpecification");

		PersonalInformation personalInformation = (PersonalInformation) candidate;

		if (personalInformation.getAddress() != null
				    && (personalInformation.getAddress().getCity() != null
						        && personalInformation.getAddress().getCountry() != null)) {
			return true;
		}

		return false;
	}
}
