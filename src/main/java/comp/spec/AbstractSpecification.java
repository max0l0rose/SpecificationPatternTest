package comp.spec;

public abstract class AbstractSpecification implements ISpecification {
	public abstract boolean isSatisfiedBy(Object candidate);

	public ISpecification and(ISpecification other) {
		return null;
	}

	public ISpecification or(ISpecification other) {
		return null;
	}
}
