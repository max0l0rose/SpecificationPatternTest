package comp.spec;

public interface ISpecification {
	boolean isSatisfiedBy(Object candidate);

	ISpecification and(ISpecification other);

	ISpecification or(ISpecification other);
}
