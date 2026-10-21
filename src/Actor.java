import java.util.Objects;

public class Actor extends Person {
	private final int height;

	public Actor(Person person, int height) {
		super(person.getName(), person.getSurname(), person.getGender());
		this.height = height;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Actor actor = (Actor) o;
		return getName().equals(actor.getName())
				&& getSurname().equals(actor.getSurname())
				&& height == actor.height;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), height);
	}

	@Override
	public String toString() {
		return super.toString() + " (" + height + ")";
	}
}
