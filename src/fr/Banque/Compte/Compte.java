package fr.Banque.Compte;

import java.util.Objects;

public class Compte {
	/*
	 * Création de compte Utilisateur
	 */
	private int numero;
	private double solde;
	
	public Compte () {};
	
	public Compte (int numero, double solde) {
		super();
		this.numero = numero;
		this.solde = solde;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public void ajouter (double ajout) {
		this.solde += ajout;
	}
	
	public void retirer (double retrait) throws BanqueException {
		if (retrait > this.getSolde()) {
			throw new BanqueException("Retrait supérieur à votre solde");
		}
		this.solde -= retrait;		
	}

	
	
	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero, solde);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compte other = (Compte) obj;
		return numero == other.numero && Double.doubleToLongBits(solde) == Double.doubleToLongBits(other.solde);
	}
	
	
}
