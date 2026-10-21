import java.util.ArrayList;

public class Show {
	private final String title;
	private final int duration;
	private final Director director;
	private final ArrayList<Actor> listOfActors;

	public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
		this.title = title;
		this.duration = duration;
		this.director = director;
		this.listOfActors = listOfActors;
	}

	public String getTitle() {
		return title;
	}

	public int getDuration() {
		return duration;
	}

	public Director getDirector() {
		return director;
	}

	public ArrayList<Actor> getListOfActors() {
		return listOfActors;
	}

	public void printListOfActors() {
		for (Actor actor : listOfActors) {
			System.out.println(actor);
		}
	}

	public void printDirector() {
		System.out.println(director);
	}

	public void addNewActor(Actor newActor) {
		boolean actorFound = listOfActors.contains(newActor);
		if (actorFound) {
			System.out.println(newActor + "уже есть в списке");
		} else {
			listOfActors.add(newActor);
		}
	}

	public void switchActor(Actor fromActor, Actor toActor) {
		boolean actorFound = listOfActors.contains(fromActor);
		if (actorFound) {
			listOfActors.remove(fromActor);
			listOfActors.add(toActor);
		} else {
			System.out.println(fromActor + " не найден в спиcке");
		}
	}

}


