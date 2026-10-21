public class Opera extends MusicalShow {
	private int choirSize;

	public Opera(MusicalShow musicalShow, int choirSize) {
		super(musicalShow.getParent(), musicalShow.getMusicAuthor(), musicalShow.getLibrettoText());
	}

}
