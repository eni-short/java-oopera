import java.util.Objects;

public class Person {
	private final String name;
	private final String surname;
	private final Gender gender;

	public Person(String name, String surname, Gender gender) {
		this.name = name;
		this.surname = surname;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Gender getGender() {
		return gender;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;

		Person person = (Person) o;
		return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && gender == person.gender;
	}

	@Override
	public int hashCode() {
		int result = Objects.hashCode(name);
		result = 31 * result + Objects.hashCode(surname);
		result = 31 * result + Objects.hashCode(gender);
		return result;
	}

	@Override
	public String toString() {
		return getName() + " " + getSurname();
	}
}

