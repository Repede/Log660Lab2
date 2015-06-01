package model;

public class Adresse
{
	private int noAdresse;
	private String noCivique;
	private int noApartement;
	private String nomRue;
	private String nomVille;
	private String nomProvince;
	private String nomPays;
	private String codePostal;
	
	public int getNoAdresse()
	{
		return noAdresse;
	}
	public void setNoAdresse(int noAdresse)
	{
		this.noAdresse = noAdresse;
	}
	
	public String getNoCivique()
	{
		return noCivique;
	}
	public void setNoCivique(String noCivique)
	{
		this.noCivique = noCivique;
	}
	
	public int getNoApartement()
	{
		return noApartement;
	}
	public void setNoApartement(int noApartement)
	{
		this.noApartement = noApartement;
	}
	
	public String getNomRue()
	{
		return nomRue;
	}
	public void setNomRue(String nomRue)
	{
		this.nomRue = nomRue;
	}
	
	public String getNomVille()
	{
		return nomVille;
	}
	public void setNomVille(String nomVille)
	{
		this.nomVille = nomVille;
	}
	
	public String getNomProvince()
	{
		return nomProvince;
	}
	public void setNomProvince(String nomProvince)
	{
		this.nomProvince = nomProvince;
	}
	
	public String getNomPays()
	{
		return nomPays;
	}
	public void setNomPays(String nomPays)
	{
		this.nomPays = nomPays;
	}
	
	public String getCodePostal()
	{
		return codePostal;
	}
	public void setCodePostal(String codePostal)
	{
		this.codePostal = codePostal;
	}
}
