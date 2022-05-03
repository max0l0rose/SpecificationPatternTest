package comp;

import comp.model.Name;
import comp.model.PersonalInformation;
import comp.spec.AddressSpecification;
import comp.spec.NameSpecification;

public class Main {

//    @Property(mustSatisfy=StartWithCapitalLetterSpecification.class)
//    public String getFirstName() { /* ... */ }

    public static void main(String[] args) {
        NameSpecification nameSpecification = new NameSpecification();
        AddressSpecification addressSpecification = new AddressSpecification();

//        Name name = new Name("FName", "LName");
//        Address address1 = null;
        PersonalInformation personalInformation = new PersonalInformation(new Name("FName", "LName"), null);
        boolean andSpecifiedWithNullAddress = nameSpecification.and(addressSpecification).isSatisfiedBy(personalInformation);
        System.out.println("andSpecified with null address is : " + andSpecifiedWithNullAddress);

//        Address address = new Address("City", "India");
//        PersonalInformation personalInformation1 = new PersonalInformation(name, address);
//        boolean andSpecifiedWithAddress = nameSpecification.and(addressSpecification).isSatisfiedBy(personalInformation1);
//        System.out.println("andSpecified with address is : " + andSpecifiedWithAddress);
    }
}


