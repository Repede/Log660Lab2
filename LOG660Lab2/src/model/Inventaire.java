package model;

public class Inventaire
{
	private int noCode;
	private int nbCopies;

	private Film film;

	public int getNoCode()
	{
		return noCode;
	}

	public Film getFilm()
	{
		return film;
	}

	public int getNbCopies()
	{
		return nbCopies;
	}
	
	public void setNoCode(int noCode)
	{
		this.noCode = noCode;
	}
	
	public void setFilm(Film film)
	{
		this.film = film;
	}

	public void setNbCopies(int nbCopies)
	{
		this.nbCopies = nbCopies;
	}
}
