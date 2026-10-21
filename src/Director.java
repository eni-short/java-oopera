public class Director extends Person {
	private final int numberOfShows;

	public Director(Person person, int numberOfShows) {
		super(person.getName(), person.getSurname(), person.getGender());
		this.numberOfShows = numberOfShows;
	}

}
