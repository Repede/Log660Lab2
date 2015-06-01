package model;

public class Location
{
	private int noClient;
	private int noFilm;
	private Date dateLocation;
	private Date dateRetour;
	
	public int getNoClient() {
		return noClient;
	}

	public int getNoFilm() {
		return noFilm;
	}

	public Date getDateLocation() {
		return dateLocation;
	}
	
	public void setDateLocation(Date dateLocation) {
		this.dateLocation = dateLocation;
	}
	
	public Date getDateRetour() {
		return dateRetour;
	}
	
	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}
}
