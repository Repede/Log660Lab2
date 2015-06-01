package model;

import java.util.Date;

public class CarteCredit
{
	public int noCC;
	public Date dateExpiration;
	public String nomProprietaire;
	public int cvv;
	public enum typeCC{VISA,MASTERCARD,AMEX};
}