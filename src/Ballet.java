public class Ballet extends MusicalShow {
	private final Person choreographer;

	public Ballet(MusicalShow musicalShow, Person choreographer) {
		super(musicalShow.getParent(), musicalShow.getMusicAuthor(), musicalShow.getLibrettoText());
		this.choreographer = choreographer;
	}
}
