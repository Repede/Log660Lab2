package model;

import java.util.Date;

public class CarteCredit
{
	private int noCC;
	private Date dateExpiration;
	private String nomProprietaire;
	private int cvv;
	private enum typeCC{VISA,MASTERCARD,AMEX}
	
	public int getNoCC()
	{
		return noCC;
	}
	public void setNoCC(int noCC)
	{
		this.noCC = noCC;
	}
	
	public Date getDateExpiration()
	{
		return dateExpiration;
	}
	public void setDateExpiration(Date dateExpiration)
	{
		this.dateExpiration = dateExpiration;
	}
	
	public String getNomProprietaire()
	{
		return nomProprietaire;
	}
	public void setNomProprietaire(String nomProprietaire)
	{
		this.nomProprietaire = nomProprietaire;
	}
	
	public int getCvv()
	{
		return cvv;
	}
	public void setCvv(int cvv)
	{
		this.cvv = cvv;
	};
}