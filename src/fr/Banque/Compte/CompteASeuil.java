package fr.Banque.Compte;

public class CompteASeuil extends Compte {
	/*
	 * Définition qui limite jusqu'où le compte peut descendre
	 */
	// Montant en dessous duquel le compte ne peut descendre
	private double seuil;

	public CompteASeuil() {
		super();
	}

	public CompteASeuil(int numero, int solde, double seuil) {
		super(numero, solde);
		this.seuil = seuil;
	}

	public double getSeuil() {
		return seuil;
	}

	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}

	public void retirer(double retrait) {
		double resultat = this.getSolde() - retrait;
		if (resultat > this.getSeuil()) {
			this.setSolde(this.getSolde() - retrait);
			System.out.println(this.getSolde());
		} else {
			System.out.println("Vous ne pouvez retire cette somme car votre seuil est à " + this.seuil);
		}
	}

	@Override
	public String toString() {
		return "CompteASeuil [seuil=" + seuil + "]";
	}

}
