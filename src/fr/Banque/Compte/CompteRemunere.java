package fr.Banque.Compte;

public class CompteRemunere extends Compte implements ICompteRemunere {
	/*
	 * Déclaration, calcul du taux et ajout des intérêts pour le compte de l'utilisateur
	 */
	private double taux;

	public CompteRemunere() {
		super();
	};

	public CompteRemunere(int numero, double d, double taux) {
		super(numero, d);
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public double calculerInteret() {
		double res = this.getSolde() * taux;
		return res;
	}

	public void verserInteret () {
		double sum = this.calculerInteret() + this.getSolde();
		this.setSolde(sum);
	}


	
}
