public class MusicalShow extends Show {
	private final Person musicAuthor;
	private final String librettoText;
	private final Show show;

	public MusicalShow(Show show, Person musicAuthor, String librettoText) {
		super(show.getTitle(), show.getDuration(), show.getDirector(), show.getListOfActors());
		this.musicAuthor = musicAuthor;
		this.librettoText = librettoText;
		this.show = show;
	}

	public String getLibrettoText() {
		return librettoText;
	}

	public Show getParent() {
		return show;
	}

	public Person getMusicAuthor() {
		return musicAuthor;
	}

}
