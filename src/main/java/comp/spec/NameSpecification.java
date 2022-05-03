package comp.spec;

import comp.model.PersonalInformation;

public class NameSpecification extends AbstractSpecification {
	@Override
	public boolean isSatisfiedBy(Object candidate) {
		System.out.println("isSatisfiedBy of spec.NameSpecification");

		PersonalInformation personalInformation = (PersonalInformation) candidate;

		if (personalInformation.getName() != null
				    && (personalInformation.getName().getFirstName() != null
						        && personalInformation.getName().getLastName() != null)) {
			return true;
		}

		return false;
	}
}
