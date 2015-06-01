package model;

public class Inventaire
{
	private int noCode;
	private int noFilm;
	private int nbCopies;
	
	public int getNoCode() {
		return noCode;
	}

	public int getNoFilm() {
		return noFilm;
	}

	public int getNbCopies() {
		return nbCopies;
	}
	
	public void setNbCopies(int nbCopies) {
		this.nbCopies = nbCopies;
	}
}
