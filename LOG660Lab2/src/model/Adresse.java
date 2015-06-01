package model;

public class Adresse
{
	public String noCivique;
	public int noApartement;
	public String nomRue;
	public String nomVille;
	public String nomProvince;
	public String nomPays;
	public String codePostal;
	
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
