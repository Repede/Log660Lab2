package model;
import model.Util.TypeForfait;

public class Forfait
{
	private int noForfait;
	private TypeForfait typeForfait;
	private float cout;
	private int locationMax;
	private int dureeMax;
	
	public int getNoForfait() {
		return noForfait;
	}
	
	public TypeForfait getTypeForfait() {
		return typeForfait;
	}
	
	public void setTypeForfait(TypeForfait typeForfait) {
		this.typeForfait = typeForfait;
	}
	
	public float getCout() {
		return cout;
	}
	
	public void setCout(float cout) {
		this.cout = cout;
	}
	
	public int getLocationMax() {
		return locationMax;
	}
	
	public void setLocationMax(int locationMax) {
		this.locationMax = locationMax;
	}
	
	public int getDureeMax() {
		return dureeMax;
	}
	
	public void setDureeMax(int dureeMax) {
		this.dureeMax = dureeMax;
	}
	
	
}
