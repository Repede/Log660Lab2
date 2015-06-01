package model;

import java.util.Date;

public class Client
{
	private int noClient;
	private String nomClient;
	private String prenomClient;
	private String courriel;
	private String noTelephone;
	private Adresse adresse;
	private CarteCredit carteCredit;
	private Date dateNaissance;
	private String motDePasse;
	private Forfait forfait;
	
	public int getNoClient()
	{
		return noClient;
	}
	public void setNoClient(int noClient)
	{
		this.noClient = noClient;
	}
	
	public String getNomClient()
	{
		return nomClient;
	}
	public void setNomClient(String nomClient)
	{
		this.nomClient = nomClient;
	}
	
	public String getPrenomClient()
	{
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient)
	{
		this.prenomClient = prenomClient;
	}
	
	public String getCourriel()
	{
		return courriel;
	}
	public void setCourriel(String courriel)
	{
		this.courriel = courriel;
	}
	
	public String getNoTelephone()
	{
		return noTelephone;
	}
	public void setNoTelephone(String noTelephone)
	{
		this.noTelephone = noTelephone;
	}
	
	public Adresse getAdresse()
	{
		return adresse;
	}
	public void setAdresse(Adresse adresse)
	{
		this.adresse = adresse;
	}
	
	public CarteCredit getCarteCredit()
	{
		return carteCredit;
	}
	public void setCarteCredit(CarteCredit carteCredit)
	{
		this.carteCredit = carteCredit;
	}
	
	public Date getDateNaissance()
	{
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance)
	{
		this.dateNaissance = dateNaissance;
	}
	
	public String getMotDePasse()
	{
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse)
	{
		this.motDePasse = motDePasse;
	}
	
	public Forfait getForfait()
	{
		return forfait;
	}
	public void setForfait(Forfait forfait)
	{
		this.forfait = forfait;
	}
}