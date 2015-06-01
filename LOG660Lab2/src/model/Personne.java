package model;

import java.util.Date;

public class Personne
{
	private int noPersonne;
	private String nom;
	private Date dateNaissance;
	private String lieuNaissance;
	private String biographie;
	
	public int getNoPersonne()
	{
		return noPersonne;
	}
	public void setNoPersonne(int noPersonne)
	{
		this.noPersonne = noPersonne;
	}
	
	public String getNom()
	{
		return nom;
	}
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public Date getDateNaissance()
	{
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance)
	{
		this.dateNaissance = dateNaissance;
	}
	
	public String getLieuNaissance()
	{
		return lieuNaissance;
	}
	public void setLieuNaissance(String lieuNaissance)
	{
		this.lieuNaissance = lieuNaissance;
	}
	
	public String getBiographie()
	{
		return biographie;
	}
	public void setBiographie(String biographie)
	{
		this.biographie = biographie;
	}
}
